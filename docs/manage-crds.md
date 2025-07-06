# 아래는 Fabric8 Kubernetes Client를 사용하여 Java에서 CustomResourceDefinition (CRD) 를 정의하고 사용하는 방법을 중심으로, RayClusterService.java에서 사용된 문법을 바탕으로 작성한 문서입니다.

---

## 📘 Java에서 Fabric8 Client로 CRD 활용하기: RayCluster 예제 기반 가이드

## 📌 목차
- [1. 소개](#1-소개)
- [2. CRD 모델 클래스 생성](#2-CRD-모델-클래스-생성)
- [3. Builder 패턴을 활용한 CR 인스턴스 생성](#3-Builder-패턴을-활용한-CR-인스턴스-생성)
- [4. Kubernetes 리소스 조작 (생성, 수정, 삭제)](#4-Kubernetes-리소스-조작-생성-수정-삭제)
- [5. 실전 예제 코드 설명](#5-실전-예제-RayClusterService)
- [6. 정리 및 참고 자료](#6-정리-및-참고-자료)

---

## 1. 📖 소개

이 문서는 Java 기반 Kubernetes 클라이언트인 Fabric8을 사용하여 CRD 기반 리소스를 생성하고 관리하는 방법을 설명합니다. 실습 대상은 KubeRay의 RayCluster CRD이며, 해당 리소스를 Java로 어떻게 선언하고 다루는지를 `RayClusterService` 클래스를 기반으로 설명합니다.

---

## 2. 🧱 CRD 모델 클래스 생성

### 방법 ①: Fabric8 Code Generator 사용
- CRD YAML 파일로부터 POJO(Java 객체) 자동 생성
- CLI 명령어 예시:

```bash
java -jar crd-generator-cli.jar \
--output-path=./src/main/java \
--package-name=io.shimshim.fabricpractice.model.ray.cluster.v1 \
raycluster-crd.yaml
```

### 결과
- `RayCluster`, `RayClusterBuilder`, `RayClusterSpec` 등 다양한 중첩 모델 클래스 생성됨
- 모든 클래스는 Fabric8의 `CustomResource` 또는 `CustomResourceList` 를 상속함

---

## 3. 🛠️ Builder 패턴을 활용한 CR 인스턴스 생성

Fabric8은 Fluent Builder 패턴을 기반으로 객체를 계층적으로 선언할 수 있도록 지원합니다.

### 주요 패턴 설명

#### 메서드 분류별 설명

Builder 패턴에서는 다양한 상황에 맞게 메서드가 구분되어 제공됩니다. 아래는 `RayClusterBuilder`를 비롯한 CRD 리소스 생성에서 사용되는 주요 메서드 분류입니다.

| 메서드 유형         | 예시                           | 용도 설명 |
|---------------------|--------------------------------|----------|
| `withX(value)`       | `.withName("example")`          | 단일 필드에 값을 설정할 때 사용합니다. |
| `withNewX()` / `endX()` | `.withNewSpec().endSpec()`      | 중첩 구조 객체를 선언할 때 사용합니다. |
| `addNewX()` / `endX()`  | `.addNewContainer().endContainer()` | List 타입 항목을 추가할 때 사용합니다. |
| `addToX(List)`        | `.addToLabels(Map)`             | 리스트나 맵에 다수의 값을 추가할 때 사용합니다. |
| `editOrNewX()`        | `.editOrNewMetadata()`          | 이미 존재하는 객체를 수정하거나 새로 생성할 때 사용합니다. |
| `editMatchingX()`     | `.editMatchingContainer(...)`   | 조건에 맞는 리스트 요소를 찾아 편집할 때 사용합니다. |

이러한 메서드들은 체이닝(Chaining) 방식으로 계층적으로 선언할 수 있어 복잡한 CRD 구조도 명확하게 표현할 수 있습니다.

### 예제: RayCluster 생성

```java
RayCluster cluster = new RayClusterBuilder()
    .withNewMetadata()
        .withName("example")
        .withNamespace("default")
    .endMetadata()
    .withNewSpec()
        .withNewAutoscalerOptions()
            .withImage("rayproject/ray:latest")
        .endAutoscalerOptions()
        .addNewWorkerGroupSpec()
            .withGroupName("workers")
            .withReplicas(2)
            .withNewTemplate()
                .withNewSpec()
                    .addNewContainer()
                        .withImage("rayproject/ray:latest")
                    .endContainer()
                .endSpec()
            .endTemplate()
        .endWorkerGroupSpec()
    .endSpec()
    .build();
```

---

## 4. 🚀 Kubernetes 리소스 조작 (생성, 수정, 삭제)

KubernetesClient를 통해 CRD 리소스를 CRUD 방식으로 제어할 수 있습니다.

### 생성(Create)

```java
k8s.resources(RayCluster.class)
    .inNamespace("default")
    .resource(cluster)
    .create();
```

### 수정(Update)

```java
k8s.resources(RayCluster.class)
    .inNamespace("default")
    .resource(cluster)
    .update();
```

### 삭제(Delete)

```java
k8s.resources(RayCluster.class)
    .inNamespace("default")
    .withName("example")
    .delete();
```

---

## 5. 🔍 실전 예제: RayClusterService

### 5.1 `createCluster`

사용자 요청 DTO(`RayClusterRequest`)를 받아 `RayCluster` 객체를 생성 후 클러스터에 배포.

```java
public RayCluster createCluster(RayClusterRequest req) {
    RayCluster manifest = buildRayCluster(req);
    return k8s.resources(RayCluster.class)
        .inNamespace(manifest.getMetadata().getNamespace())
        .resource(manifest)
        .create();
}
```

### 5.2 `buildRayCluster`

사용자 입력을 기반으로 `RayClusterBuilder`를 통해 리소스를 구성.

```java
private RayCluster buildRayCluster(RayClusterRequest req) {
    return new RayClusterBuilder()
        .withNewMetadata()
            .withName(req.getName())
            .withNamespace(req.getNamespace())
        .endMetadata()
        .withNewSpec()
            .withNewAutoscalerOptions()
                .withImage(req.getImage())
            .endAutoscalerOptions()
            .addNewWorkerGroupSpec()
                .withReplicas(req.getWorkerReplicas())
                .withGroupName("workers")
                .withNewTemplate()
                    .withNewSpec()
                        .addNewContainer()
                            .withImage(req.getImage())
                        .endContainer()
                    .endSpec()
                .endTemplate()
            .endWorkerGroupSpec()
        .endSpec()
        .build();
}
```

---

## 6. 📚 정리 및 참고 자료

| 항목          | 내용                    |
|---------------|-------------------------|
| 라이브러리     | Fabric8 Kubernetes Client |
| 코드 생성기    | CRD Java Generator CLI   |
| KubeRay CRD   | KubeRay GitHub           |
| 주요 개념     | Fluent Builder, CRD POJO, KubernetesClient |

---

✅ 추천 포맷 (Notion 등으로 정리할 때)
- 왼쪽 사이드바에 각 절 번호를 목차로 배치
- 예제는 코드 블록(````java`)으로 구분
- 실전 코드는 실제 `.java` 파일 경로와 함께 링크 (예: `src/main/java/.../RayClusterService.java`)

---

필요하다면 이 내용을 Notion 또는 MkDocs에 맞게 마크다운 포맷으로 변환해드릴 수 있습니다. 원하시나요?