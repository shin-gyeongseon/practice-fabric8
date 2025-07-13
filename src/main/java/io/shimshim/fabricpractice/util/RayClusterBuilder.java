package io.shimshim.fabricpractice.util;

import io.shimshim.fabricpractice.model.ray.cluster.v1.RayCluster;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.shimshim.fabricpractice.dto.UpdateRayClusterRequest;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterSpec;
import io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.HeadGroupSpec;
import io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.WorkerGroupSpecs;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class RayClusterBuilder {

    private RayCluster rayCluster;

    @Autowired
    private ObjectMapper objectMapper;

    public RayClusterBuilder setRayClusterByUpdateRayClusterRequest(UpdateRayClusterRequest request) {
        // Metadata 설정
        this.rayCluster.setMetadata(new io.fabric8.kubernetes.api.model.ObjectMetaBuilder()
                .withName(request.getMetadata().getName())
                .withNamespace(request.getMetadata().getNamespace())
                .build());

        // RayClusterSpec 생성 및 설정
        RayClusterSpec rayClusterSpec = new RayClusterSpec();

        // HeadGroupSpec 설정
        HeadGroupSpec headGroupSpec = new HeadGroupSpec();
        headGroupSpec.setRayStartParams(objectMapper.convertValue(
                request.getSpec().getHeadGroupSpec().getRayStartParams(), Map.class));
        rayClusterSpec.setHeadGroupSpec(headGroupSpec);

        // WorkerGroupSpecs 설정
        WorkerGroupSpecs workerGroupSpecs = new WorkerGroupSpecs();

        List<WorkerGroupSpecs> workerGroupSpecsList = new ArrayList<>();
        for (UpdateRayClusterRequest.WorkerGroupSpec workerGroupSpecRequest : request.getSpec().getWorkerGroupSpecs()) {
            WorkerGroupSpecs workerGroupSpec = new WorkerGroupSpecs();
            workerGroupSpec.setMaxReplicas(workerGroupSpecRequest.getMaxReplicas());
            workerGroupSpec.setMinReplicas(workerGroupSpecRequest.getMinReplicas());
            workerGroupSpec.setRayStartParams(objectMapper.convertValue(workerGroupSpecRequest.getRayStartParams(), Map.class));
            workerGroupSpec.setReplicas(workerGroupSpecRequest.getReplicas());
            workerGroupSpecsList.add(workerGroupSpec);
        }
        rayClusterSpec.setWorkerGroupSpecs(workerGroupSpecsList);

        // RayCluster에 Spec 설정
        this.rayCluster.setSpec(rayClusterSpec);

        return this;
    }

    public RayCluster build() {
        return this.rayCluster;
    }
}