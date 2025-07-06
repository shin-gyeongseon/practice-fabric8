

# 🧪 RayJob CRD 인터페이스 정의서

RayJob은 Ray에서 단일 작업(Job)을 정의하고 실행하기 위한 Custom Resource입니다. Kubernetes 상에서 실행되는 배치성 작업이나 파이프라인 처리를 정의하는 데 사용됩니다.

---

## 📌 기본 정보

| 항목 | 설명 |
|------|------|
| **Group** | `ray.io` |
| **Version** | `v1` |
| **Kind** | `RayJob` |
| **Scope** | `Namespaced` |
| **Plural** | `rayjobs` |
| **Singular** | `rayjob` |

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
| `entrypoint` | string | ✅ | 실행할 Python 스크립트 또는 명령어 |
| `runtimeEnv` | string | ❌ | 파이썬 환경 정의 (예: pip 패키지, env var 등) |
| `metadata` | object | ❌ | Ray 작업의 메타데이터 |
| `shutdownAfterJobFinishes` | boolean | ❌ | 작업 종료 후 클러스터 종료 여부 |
| `ttlSecondsAfterFinished` | integer | ❌ | 작업 완료 후 리소스 삭제까지의 TTL |
| `suspend` | boolean | ❌ | 작업 일시 중단 여부 |
| `jobId` | string | ❌ | 사용자 정의 Job ID |
| `rayClusterSpec` | object | ✅ | Job이 실행될 RayCluster 정의 |

---

### 🔹 Status

| 필드명 | 타입 | 설명 |
|--------|------|------|
| `jobId` | string | 실제 실행된 Ray Job의 ID |
| `status` | string | 현재 상태 (`Pending`, `Running`, `Succeeded`, `Failed`) |
| `message` | string | 상태 관련 메시지 |
| `startTime` | string | 작업 시작 시간 |
| `endTime` | string | 작업 종료 시간 |

---

## 🧾 전체 필드 요약

| 경로 | 타입 | 설명 |
|------|------|------|
| `spec.entrypoint` | string | 실행 대상 명령어 또는 스크립트 |
| `spec.runtimeEnv` | string | 파이썬 환경 정의 |
| `spec.rayClusterSpec` | object | 함께 정의된 RayCluster 리소스 |
| `spec.shutdownAfterJobFinishes` | boolean | 작업 종료 후 종료 여부 |
| `spec.ttlSecondsAfterFinished` | integer | TTL 설정 |
| `status.status` | string | 현재 상태 |
| `status.message` | string | 상태 메시지 |
| `status.jobId` | string | Ray 작업 ID |
| `status.startTime` | string | 작업 시작 시각 |
| `status.endTime` | string | 작업 종료 시각 |

---

## 📦 JSON 응답 예시

```json
{
  "apiVersion": "ray.io/v1",
  "kind": "RayJob",
  "metadata": {
    "name": "example-rayjob",
    "namespace": "default"
  },
  "spec": {
    "entrypoint": "python script.py",
    "runtimeEnv": "pip:\n  - pandas\nenv_vars:\n  ENV: production",
    "shutdownAfterJobFinishes": true,
    "ttlSecondsAfterFinished": 3600,
    "rayClusterSpec": {
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
    }
  },
  "status": {
    "jobId": "job-xyz123",
    "status": "Running",
    "message": "Job is currently executing",
    "startTime": "2025-07-06T12:00:00Z",
    "endTime": null
  }
}
```