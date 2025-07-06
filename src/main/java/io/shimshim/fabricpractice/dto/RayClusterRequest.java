package io.shimshim.fabricpractice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RayClusterRequest {

    /** RayCluster 리소스 이름 */
    private String name;

    /** 배포 네임스페이스 (미지정 시 "default") */
    private String namespace;

    /** Ray 이미지 (예: rayproject/ray:2.11.0) */
    private String image;

    /** Head 파드 복제 수 (기본 1) */
    private Integer headReplicas;

    /** Worker 파드 복제 수 (없으면 0) */
    private Integer workerReplicas;
}
