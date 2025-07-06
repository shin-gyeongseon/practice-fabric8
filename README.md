# ☸️ Fabric8 기반 Kubernetes CRD 연습 프로젝트

이 프로젝트는 Kubernetes의 CustomResourceDefinition(CRD)을 Java 객체로 변환하고, Fabric8의 Builder 패턴을 활용하여 리소스를 선언하는 과정을 실습한 결과를 담고 있습니다.

---

## 📌 연습 목표

- CRD 정의 파일을 기반으로 Java POJO 생성
- 생성된 POJO에 Builder 패턴 적용
- Builder 패턴을 사용해 RayCluster 리소스를 선언 및 조작
- Spring 기반 서비스에서 리소스 생성 및 배포 구현

---

## 🧱 주요 구성

### 1. CRD → POJO 생성
- `crd-generator-cli` 사용
- 명령어 예시:
  ```bash
  java -jar crd-generator-cli.jar \
    --output-path=./src/main/java \
    --package-name=io.shimshim.fabricpractice.model.ray.cluster.v1 \
    raycluster-crd.yaml
  ```
> 위 명령어는 단순히 CLI로 소스 코드를 생성하지만, 실제 Maven 기반 프로젝트에서 자동화하려면 `pom.xml` 내에 annotation processor 및 plugin 설정이 필요합니다. 다음은 `pom.xml` 예시입니다:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>io.fabric8</groupId>
      <artifactId>crd-generator-apt</artifactId>
      <version>6.7.0</version>
      <executions>
        <execution>
          <id>generate-crd</id>
          <goals>
            <goal>generate</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

#### Maven 의존성 설정

POJO 클래스 생성을 위해서는 코드 생성기 외에도 몇 가지 의존성 추가가 필요합니다. 아래는 반드시 추가되어야 할 주요 라이브러리입니다:

```xml
<dependency>
  <groupId>io.fabric8</groupId>
  <artifactId>generator-annotations</artifactId>
  <version>${fabric8.version}</version>
  <scope>provided</scope>
</dependency>
<dependency>
  <groupId>io.sundr</groupId>
  <artifactId>builder-annotations</artifactId>
  <version>${sundrio.version}</version>
  <scope>provided</scope>
</dependency>
<dependency>
  <groupId>org.projectlombok</groupId>
  <artifactId>lombok</artifactId>
  <version>${lombok.version}</version>
  <scope>provided</scope>
  <optional>true</optional>
</dependency>
```

- `generator-annotations`: CRD의 메타 정보 주석 생성을 위한 Fabric8 어노테이션 제공
- `builder-annotations`: `@Buildable`, `@Pojo` 등 Builder 패턴 생성을 위한 핵심 어노테이션 포함
- `lombok`: 반복적인 메서드 생성을 자동화하여 코드 가독성을 높여줌

위 설정이 있어야 Builder 패턴 기반의 구조까지 정상적으로 생성됩니다.

#### CLI 사용 후 어노테이션 기반 코드 생성 처리

CLI를 통해 생성된 소스코드는 기본적인 POJO 형태로만 제공되며, 이후 Builder 패턴 적용이나 추가 메타정보 삽입은 어노테이션 프로세서에 의해 처리됩니다.

생성된 클래스에 `@Buildable`, `@Pojo`, `@JsonProperty` 등의 어노테이션이 포함되어 있다면, 빌드 시 `crd-generator-apt` 플러그인과 연계되어 **builder 메서드, equals/hashCode, JSON 직렬화 관련 코드**가 자동으로 생성됩니다.

따라서 CLI로 코드 생성 → Maven 빌드 수행 → 완성된 구조 반영의 흐름을 통해 전체 Builder 기반 객체 구성이 완성됩니다.

### 2. Builder 패턴 구조
- `withNewX()`, `endX()`, `addNewX()` 등을 이용한 계층적 선언
- 예:
  ```java
  new RayClusterBuilder()
    .withNewMetadata()
      .withName("example")
    .endMetadata()
    .build();
  ```

---

## 🔍 실습 상세 내용

- `RayClusterRequest` 모델 정의
- `RayClusterService`에서 Builder를 이용한 리소스 생성
- Kubernetes 클러스터에 리소스 생성, 업데이트, 삭제 기능 구현

---

## 🚀 실행 방법

1. CRD YAML 준비
2. Code Generator로 Java 클래스 생성
3. Spring 프로젝트 내에서 Builder 패턴 활용하여 리소스 구성
4. `KubernetesClient`를 통해 리소스 조작

---

## 📚 참고 문서

- [Fabric8 Kubernetes Client](https://github.com/fabric8io/kubernetes-client)
- [KubeRay Project](https://github.com/ray-project/kuberay)