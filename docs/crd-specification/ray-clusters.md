

# ☸️ RayCluster CRD 인터페이스 정의서

RayCluster는 KubeRay에서 제공하는 Custom Resource Definition(CRD)으로, Ray 클러스터의 헤드 노드와 워커 노드를 Kubernetes 환경에서 정의하고 제어하기 위한 리소스입니다.

---

## 📌 기본 정보

| 항목 | 설명 |
|------|------|
| **Group** | `ray.io` |
| **Version** | `v1` |
| **Kind** | `RayCluster` |
| **Scope** | `Namespaced` |
| **Plural** | `rayclusters` |
| **Singular** | `raycluster` |

---

## 🧾 필드 정의

### 🔹 Metadata

| 필드명 | 타입 | 필수 여부 | 설명 |
|--------|------|------------|------|
| `name` | string | ✅ | 리소스 이름 |
| `namespace` | string | ✅ | 리소스가 속한 네임스페이스 |
| `labels` | map | ❌ | 리소스에 부착할 라벨 |
| `annotations` | map | ❌ | 메타 정보용 주석 |

---

### 🔹 Spec

#### 🔸 `headGroupSpec` (필수)

Ray 클러스터의 Head 노드를 구성합니다.

| 필드명 | 타입 | 필수 여부 | 설명 |
|--------|------|------------|------|
| `rayStartParams` | map | ✅ | Ray 실행 시 사용할 파라미터 (예: `dashboard-host`) |
| `template` | PodTemplateSpec | ✅ | Head Pod 스펙 정의 |
| `serviceType` | string | ❌ | Service 타입 (예: `ClusterIP`, `NodePort`) |
| `enableIngress` | boolean | ❌ | Ingress 사용 여부 |
| `rayResources` | map | ❌ | 리소스 명칭 정의 (예: CPU, GPU 설정 등) |

#### 🔸 `workerGroupSpecs` (옵션)

여러 개의 워커 그룹을 정의할 수 있습니다.

| 필드명 | 타입 | 필수 여부 | 설명 |
|--------|------|------------|------|
| `groupName` | string | ✅ | 워커 그룹명 |
| `replicas` | integer | ✅ | 기본 워커 개수 |
| `minReplicas` | integer | ❌ | 최소 워커 수 (오토스케일) |
| `maxReplicas` | integer | ❌ | 최대 워커 수 (오토스케일) |
| `template` | PodTemplateSpec | ✅ | 워커 Pod 템플릿 |
| `rayStartParams` | map | ✅ | 워커 시작 파라미터 |
| `rayResources` | map | ❌ | 리소스 명칭 정의 |

#### 🔸 `autoscalerOptions` (옵션)

Ray의 오토스케일러 설정입니다.

| 필드명 | 타입 | 필수 여부 | 설명 |
|--------|------|------------|------|
| `upscalingMode` | string | ❌ | `Default`, `Aggressive`, `Conservative` 중 선택 |
| `idleTimeoutSeconds` | integer | ❌ | 유휴 노드 제거까지 대기 시간 |
| `image` | string | ❌ | autoscaler 컨테이너 이미지 |
| `resources` | object | ❌ | limits/requests 자원 설정 |
| `env` | array | ❌ | 환경 변수 목록 |
| `volumeMounts` | array | ❌ | 볼륨 마운트 정의 |

---

### 🔹 Status

| 필드명 | 타입 | 설명 |
|--------|------|------|
| `state` | string | 클러스터 상태 (`Running`, `Failed`, `Succeeded` 등) |
| `desiredWorkerReplicas` | integer | 원하는 워커 개수 |
| `availableWorkerReplicas` | integer | 실제 준비된 워커 수 |
| `desiredCPU` / `desiredMemory` / `desiredGPU` / `desiredTPU` | string | 클러스터 자원 요청량 |
| `head` | object | Head Pod 및 Service 정보 (`podIP`, `serviceIP`, 등) |

---

## 📊 출력 컬럼 (kubectl get rayclusters 시 표시)

| 이름 | 경로(jsonPath) | 타입 | 설명 |
|------|----------------|------|------|
| desired workers | `.status.desiredWorkerReplicas` | integer | 요청된 워커 수 |
| available workers | `.status.availableWorkerReplicas` | integer | 준비된 워커 수 |
| cpus | `.status.desiredCPU` | string | 요청된 CPU |
| memory | `.status.desiredMemory` | string | 요청된 메모리 |
| gpus | `.status.desiredGPU` | string | 요청된 GPU |
| tpus | `.status.desiredTPU` | string | 요청된 TPU |
| status | `.status.state` | string | 현재 상태 |
| age | `.metadata.creationTimestamp` | date | 생성 시간 |
| head pod IP | `.status.head.podIP` | string | Head Pod의 IP |
| head service IP | `.status.head.serviceIP` | string | Head 서비스 IP |

---

---

## 🧾 전체 필드 요약

| 경로 | 타입 | 설명 |
|------|------|------|
| `metadata.name` | string | 클러스터 이름 |
| `metadata.namespace` | string | 네임스페이스 |
| `spec.headGroupSpec.rayStartParams` | map | Head 노드의 시작 파라미터 |
| `spec.headGroupSpec.template` | PodTemplateSpec | Head Pod의 템플릿 정의 |
| `spec.headGroupSpec.serviceType` | string | Head 서비스 타입 |
| `spec.headGroupSpec.enableIngress` | boolean | Head Ingress 활성화 여부 |
| `spec.headGroupSpec.rayResources` | map | Head 리소스 정의 |
| `spec.workerGroupSpecs[]` | array | 워커 그룹 목록 |
| `spec.workerGroupSpecs[].groupName` | string | 워커 그룹 이름 |
| `spec.workerGroupSpecs[].replicas` | integer | 워커 수 |
| `spec.workerGroupSpecs[].rayStartParams` | map | 워커 시작 파라미터 |
| `spec.workerGroupSpecs[].template` | PodTemplateSpec | 워커 Pod 템플릿 |
| `spec.autoscalerOptions.upscalingMode` | string | 오토스케일 모드 |
| `spec.autoscalerOptions.idleTimeoutSeconds` | integer | 유휴 타임아웃 |
| `spec.autoscalerOptions.image` | string | 오토스케일러 이미지 |
| `spec.autoscalerOptions.resources` | object | 오토스케일러 리소스 |
| `spec.autoscalerOptions.env` | array | 환경 변수 |
| `status.state` | string | 클러스터 상태 |
| `status.desiredWorkerReplicas` | integer | 요청된 워커 수 |
| `status.availableWorkerReplicas` | integer | 준비된 워커 수 |
| `status.desiredCPU` | string | 요청된 CPU |
| `status.desiredMemory` | string | 요청된 메모리 |
| `status.desiredGPU` | string | 요청된 GPU |
| `status.desiredTPU` | string | 요청된 TPU |
| `status.head.podIP` | string | Head Pod IP |
| `status.head.serviceIP` | string | Head Service IP |

---

## 📦 JSON 응답 예시

```json
{
  "apiVersion": "ray.io/v1",
  "kind": "RayCluster",
  "metadata": {
    "name": "example-ray",
    "namespace": "default"
  },
  "spec": {
    "headGroupSpec": {
      "rayStartParams": {
        "dashboard-host": "0.0.0.0"
      },
      "template": {
        "spec": {
          "containers": [
            {
              "name": "ray-head",
              "image": "rayproject/ray:latest"
            }
          ]
        }
      }
    },
    "workerGroupSpecs": [
      {
        "groupName": "workers",
        "replicas": 2,
        "rayStartParams": {},
        "template": {
          "spec": {
            "containers": [
              {
                "name": "ray-worker",
                "image": "rayproject/ray:latest"
              }
            ]
          }
        }
      }
    ]
  }
}
```