package io.shimshim.fabricpractice.service;

import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.shimshim.fabricpractice.dto.RayClusterRequest;
import io.shimshim.fabricpractice.dto.UpdateRayClusterRequest;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayCluster;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterSpec;
import io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.HeadGroupSpec;
import io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.WorkerGroupSpecs;
import io.shimshim.fabricpractice.util.RayClusterBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ManageRayCluster {

    private final KubernetesClient client;

    // RayClusterRequest를 RayCluster로 변환
    private RayCluster toRayCluster(RayClusterRequest request) {
        RayCluster rayCluster = new RayCluster();
        
        // Metadata 설정
        rayCluster.setMetadata(new ObjectMetaBuilder()
                .withName(request.getName())
                .withNamespace(request.getNamespace() != null ? request.getNamespace() : "default")
                .build());

        // Spec 설정
        RayClusterSpec spec = new RayClusterSpec();
        spec.setRayVersion(request.getImage() != null ? request.getImage().split(":")[1] : "2.11.0");

        // HeadGroupSpec 설정 (필수 필드)
        HeadGroupSpec headGroupSpec = new HeadGroupSpec();
        // headGroupSpec.setReplicas(request.getHeadReplicas() != null ? request.getHeadReplicas() : 1);
        // spec.setHeadGroupSpec(headGroupSpec);

        // WorkerGroupSpecs 설정
        if (request.getWorkerReplicas() != null && request.getWorkerReplicas() > 0) {
            WorkerGroupSpecs workerGroupSpec = new WorkerGroupSpecs();
            workerGroupSpec.setReplicas(request.getWorkerReplicas());
            spec.setWorkerGroupSpecs(Collections.singletonList(workerGroupSpec));
        } else {
            spec.setWorkerGroupSpecs(Collections.emptyList());
        }

        rayCluster.setSpec(spec);
        return rayCluster;
    }

    // RayCluster 리소스 생성 (Server-Side Apply 사용)
    public RayCluster createRayCluster(RayClusterRequest request) {
        RayCluster rayCluster = toRayCluster(request);

        return client.resources(RayCluster.class)
                .inNamespace(rayCluster.getMetadata().getNamespace())
                .resource(rayCluster)
                .serverSideApply();
    }

    // RayCluster 리소스 조회
    public RayCluster getRayCluster(RayClusterRequest request) {
        if (request.getNamespace() == null) {
            throw new IllegalArgumentException("Namespace must be provided for RayCluster operations");
        }
        return client.resources(RayCluster.class)
                .inNamespace(request.getNamespace())
                .withName(request.getName())
                .get();
    }

    // RayCluster 리소스 목록 조회
    public List<RayCluster> listRayClusters(RayClusterRequest request) {
        if (request.getNamespace() == null) {
            throw new IllegalArgumentException("Namespace must be provided for RayCluster operations");
        }
        return client.resources(RayCluster.class)
                .inNamespace(request.getNamespace())
                .list()
                .getItems();
    }

    // RayCluster 리소스 업데이트 (Server-Side Apply 사용)
    public RayCluster updateRayCluster(UpdateRayClusterRequest request) {
        RayClusterBuilder rayClusterBuilder = new RayClusterBuilder();

        // readme: 바로 아래에서 에러를 보여주고 있음
        RayCluster editedRayCluster = rayClusterBuilder.setRayClusterByUpdateRayClusterRequest(request).build();

        RayCluster getRayCluster = client.resources(RayCluster.class)
                .inNamespace(request.getMetadata().getNamespace())
                .withName(request.getMetadata().getName())
                .get();

        String namespace = editedRayCluster.getMetadata().getNamespace();
        String name = editedRayCluster.getMetadata().getName();

        return client.resources(RayCluster.class)
                .inNamespace(namespace)
                .withName(name)
                .patch(editedRayCluster);
    }

    // RayCluster 리소스 삭제
    public boolean deleteRayCluster(RayClusterRequest request) {
        String namespace = request.getNamespace() != null ? request.getNamespace() : "default";
        return client.resources(RayCluster.class)
                .inNamespace(namespace)
                .withName(request.getName())
                .delete()
                .size() == 1;
    }
}