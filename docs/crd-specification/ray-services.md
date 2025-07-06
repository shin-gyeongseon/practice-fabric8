

# 🛰 RayService CRD 인터페이스 정의서

RayService는 Ray Serve 애플리케이션을 Kubernetes 클러스터 상에서 안정적으로 운영하기 위한 Custom Resource입니다. Ray 클러스터의 수명 주기를 관리하면서 서브 애플리케이션의 롤링 업데이트, 상태 모니터링 등을 제공합니다.

---

## 📌 기본 정보

| 항목 | 설명 |
|------|------|
| **Group** | `ray.io` |
| **Version** | `v1` |
| **Kind** | `RayService` |
| **Scope** | `Namespaced` |
| **Plural** | `rayservices` |
| **Singular** | `rayservice` |

---

## 🧾 필드 정의

### 🔹 Metadata

| 필드명 | 타입 | 필수 여부 | 설명 |
|--------|------|------------|------|
| `name` | string | ✅ | 리소스 이름 |
| `namespace` | string | ✅ | 네임스페이스 |
| `labels` | map | ❌ | 라벨 정의 |
| `annotations` | map | ❌ | 어노테이션 정의 |

---

### 🔹 Spec

| 필드명 | 타입 | 필수 여부 | 설명 |
|--------|------|------------|------|
| `rayClusterConfig` | object | ✅ | Ray 클러스터 설정 (`headGroupSpec`, `workerGroupSpecs` 포함) |
| `serveConfigV2` | string | ✅ | Serve 애플리케이션 구성 YAML (string 형태) |
| `deploymentUnhealthySecondThreshold` | integer | ❌ | 비정상 상태 허용 시간 |
| `deploymentUnhealthyRestartThreshold` | integer | ❌ | 재시작 허용 횟수 |
| `serveDeploymentGraphSpec` | object | ❌ | `serveConfigV2` 대신 사용할 수 있는 Serve 설정 객체 |

---

### 🔹 Status

| 필드명 | 타입 | 설명 |
|--------|------|------|
| `status` | string | 현재 서비스 상태 (`RUNNING`, `DEPLOYING`, `FAILED`, 등) |
| `appStatus` | object | Serve 애플리케이션 상태 정보 |
| `rayClusterName` | string | 현재 연결된 RayCluster 이름 |
| `activeServiceStatus` | object | 활성 클러스터 상태 |
| `deploymentStatuses` | array | Serve 배포 상태 목록 |
| `startTime` | string | 서비스 시작 시각 |
| `endTime` | string | 서비스 종료 시각 |

---

## 🧾 전체 필드 요약

| 경로 | 타입 | 설명 |
|------|------|------|
| `metadata.name` | string | 서비스 이름 |
| `spec.rayClusterConfig` | object | Ray 클러스터 설정 |
| `spec.serveConfigV2` | string | Serve 애플리케이션 구성 (YAML string) |
| `status.status` | string | 현재 상태 |
| `status.rayClusterName` | string | 연결된 클러스터 이름 |
| `status.appStatus` | object | Serve 애플리케이션 상태 |
| `status.activeServiceStatus` | object | 활성화된 서비스 상태 |
| `status.deploymentStatuses[]` | array | Serve 배포 목록 |
| `status.startTime` / `endTime` | string | 시작/종료 시간 |

---

## 📦 JSON 응답 예시

```json
{
  "apiVersion": "ray.io/v1",
  "kind": "RayService",
  "metadata": {
    "name": "example-rayservice",
    "namespace": "default"
  },
  "spec": {
    "rayClusterConfig": {
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
      }
    },
    "serveConfigV2": "import ray\nfrom ray import serve\napp = serve.Application(...)\n"
  },
  "status": {
    "status": "RUNNING",
    "rayClusterName": "raycluster-svc",
    "appStatus": {
      "status": "HEALTHY"
    },
    "startTime": "2025-07-06T13:00:00Z",
    "endTime": null
  }
}
```