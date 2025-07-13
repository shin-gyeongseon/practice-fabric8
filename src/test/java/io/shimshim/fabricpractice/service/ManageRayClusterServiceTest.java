package io.shimshim.fabricpractice.service;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.server.mock.EnableKubernetesMockClient;
import io.shimshim.fabricpractice.dto.RayClusterRequest;
import io.shimshim.fabricpractice.dto.UpdateRayClusterRequest;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayCluster;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
//@EnableKubernetesMockClient(crud = true)
class ManageRayClusterServiceTest {

    @Qualifier("buildKubernetesClient")
    @Autowired
    private KubernetesClient client;

    @Autowired
    private ManageRayCluster manageRayCluster;

    private static final String TEST_NAMESPACE = "test-ns";
    private static final String TEST_CLUSTER_NAME = "test-cluster";

    @BeforeEach
    void setUp() {
        // 네임스페이스 내 기존 테스트 리소스 삭제 (cleanup)
        client.resources(RayCluster.class)
                .inNamespace(TEST_NAMESPACE)
                .withName(TEST_CLUSTER_NAME)
                .delete();
    }

    @AfterEach
    void tearDown() {
        // 테스트 후 리소스 삭제
        client.resources(RayCluster.class)
                .inNamespace(TEST_NAMESPACE)
                .withName(TEST_CLUSTER_NAME)
                .delete();
    }

    @Test
    void testCreateRayCluster() {
        // Given: RayClusterRequest 준비
        RayClusterRequest request = new RayClusterRequest();
        request.setName(TEST_CLUSTER_NAME);
        request.setNamespace(TEST_NAMESPACE);
        request.setImage("rayproject/ray:2.11.0");
        request.setWorkerReplicas(2);

        // When: RayCluster 생성
        RayCluster result = manageRayCluster.createRayCluster(request);

        // Then: 생성된 RayCluster 검증
        assertNotNull(result);
        assertEquals(TEST_CLUSTER_NAME, result.getMetadata().getName());
        assertEquals(TEST_NAMESPACE, result.getMetadata().getNamespace());
        assertEquals("2.11.0", result.getSpec().getRayVersion());
        assertEquals(2, result.getSpec().getWorkerGroupSpecs().get(0).getReplicas());

        // Kubernetes 클러스터에서 직접 조회하여 검증
        RayCluster fetched = client.resources(RayCluster.class)
                .inNamespace(TEST_NAMESPACE)
                .withName(TEST_CLUSTER_NAME)
                .get();
        assertNotNull(fetched);
        assertEquals("2.11.0", fetched.getSpec().getRayVersion());
    }

    @Test
    void testUpdateRayCluster() {
        // Given: 테스트용 RayCluster 먼저 생성
        RayClusterRequest createRequest = new RayClusterRequest();
        createRequest.setName(TEST_CLUSTER_NAME);
        createRequest.setNamespace(TEST_NAMESPACE);
        createRequest.setImage("rayproject/ray:2.11.0");
        createRequest.setWorkerReplicas(1);
        manageRayCluster.createRayCluster(createRequest);

        // UpdateRayClusterRequest 준비
        UpdateRayClusterRequest request = new UpdateRayClusterRequest();
        UpdateRayClusterRequest.Metadata metadata = new UpdateRayClusterRequest.Metadata();
        metadata.setName(TEST_CLUSTER_NAME);
        metadata.setNamespace(TEST_NAMESPACE);
        request.setMetadata(metadata);

        UpdateRayClusterRequest.Spec spec = new UpdateRayClusterRequest.Spec();
        UpdateRayClusterRequest.HeadGroupSpec headSpec = new UpdateRayClusterRequest.HeadGroupSpec();
        Map<String, String> headParams = new HashMap<>();

        UpdateRayClusterRequest.RayStartParams rayStartParams = new UpdateRayClusterRequest.RayStartParams();
        rayStartParams.setDashboardHost("0.0.0.0");
        headSpec.setRayStartParams(rayStartParams);

        spec.setHeadGroupSpec(headSpec);

        UpdateRayClusterRequest.WorkerGroupSpec workerSpec = new UpdateRayClusterRequest.WorkerGroupSpec();
        workerSpec.setReplicas(2);
        workerSpec.setMinReplicas(1);
        workerSpec.setMaxReplicas(5);

        List<UpdateRayClusterRequest.WorkerGroupSpec> workerGroupSpecs = Collections.singletonList(workerSpec);
        spec.setWorkerGroupSpecs(workerGroupSpecs);

        request.setSpec(spec);
        // When: RayCluster 업데이트
        RayCluster result = manageRayCluster.updateRayCluster(request);

        // Then: 업데이트된 RayCluster 검증
        assertNotNull(result);
        assertEquals(TEST_CLUSTER_NAME, result.getMetadata().getName());
        assertEquals(TEST_NAMESPACE, result.getMetadata().getNamespace());
        assertEquals("value1", result.getSpec().getHeadGroupSpec().getRayStartParams().get("param1"));
        assertEquals(2, result.getSpec().getWorkerGroupSpecs().get(0).getReplicas());
        assertEquals(1, result.getSpec().getWorkerGroupSpecs().get(0).getMinReplicas());
        assertEquals(5, result.getSpec().getWorkerGroupSpecs().get(0).getMaxReplicas());
        assertEquals("value2", result.getSpec().getWorkerGroupSpecs().get(0).getRayStartParams().get("param2"));

        // Kubernetes 클러스터에서 직접 조회하여 검증
        RayCluster fetched = client.resources(RayCluster.class)
                .inNamespace(TEST_NAMESPACE)
                .withName(TEST_CLUSTER_NAME)
                .get();
        assertNotNull(fetched);
        assertEquals(3, fetched.getSpec().getWorkerGroupSpecs().get(0).getReplicas());
    }
    
}