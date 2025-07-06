package io.shimshim.fabricpractice.service;

import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.shimshim.fabricpractice.dto.RayClusterRequest;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayCluster;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * RayCluster CRD 관리 서비스
 */
@Service
@RequiredArgsConstructor
public class RayClusterService {

    private final KubernetesClient k8s;

    /* ------------------------------------------------------------------
     * 생성 (Create)
     * ------------------------------------------------------------------ */
    public RayCluster createCluster(RayClusterRequest req) {
        RayCluster manifest = buildRayCluster(req);

        return k8s.resources(RayCluster.class)
                .inNamespace(manifest.getMetadata().getNamespace())
                .resource(manifest)
                .create();
    }

    /* ------------------------------------------------------------------
     * 수정 (Update) – 전체 치환 방식(PUT) 예시
     * ------------------------------------------------------------------ */
    public RayCluster updateCluster(RayClusterRequest req) {
        RayCluster manifest = buildRayCluster(req);

        return k8s.resources(RayCluster.class)
                .inNamespace(manifest.getMetadata().getNamespace())
                .resource(manifest)
                .update();
    }

    /* ------------------------------------------------------------------
     * 삭제 (Delete)
     * ------------------------------------------------------------------ */
    public void deleteCluster(String namespace, String name) {
        k8s.resources(RayCluster.class)
                .inNamespace(namespace)
                .withName(name)
                .delete();
    }

    /* ------------------------------------------------------------------
     * 내부 헬퍼: DTO → RayCluster 빌더
     * ------------------------------------------------------------------ */
    private RayCluster buildRayCluster(RayClusterRequest req) {
        String ns   = req.getNamespace()     != null ? req.getNamespace()     : "default"; // 없으면 4xx 예외
        int    work = req.getWorkerReplicas()!= null ? req.getWorkerReplicas(): 0;

        Map<String, IntOrString> limits = new HashMap<>();
        limits.put("cpu", new IntOrString(1));
        limits.put("memory", new IntOrString("1Gi"));

        return new RayClusterBuilder()
                .withNewMetadata()
                    .withName(req.getName())
                    .withNamespace(ns)
                .endMetadata()
                .withNewSpec()
                    .withNewAutoscalerOptions()
                        .withImage(req.getImage())
                    .endAutoscalerOptions()
                    .addNewWorkerGroupSpec()
                        .withReplicas(work)
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
}