package io.shimshim.fabricpractice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.shimshim.fabricpractice.config.KubernetesClientConfig;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayCluster;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterSpec;
import io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.HeadGroupSpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {ManageRayClusterServiceTest.TestConfig.class})
@SpringBootTest
class ManageRayClusterServiceTest {

//    @TestConfiguration
//    static class TestConfig {
//        @Bean
//        public KubernetesClient kubernetesClient() {
//            KubernetesClientConfig kubernetesClientConfig = new KubernetesClientConfig();
//            return kubernetesClientConfig.buildKubernetesClient();
//        }
//
//        @Bean
//        public ObjectMapper yamlMapper() {
//            return new ObjectMapper(new YAMLFactory());
//        }
//
//        @Bean
//        public ManageRayClusterService manageRayClusterService(KubernetesClient kubernetesClient, ObjectMapper yamlMapper) {
//            return new ManageRayClusterService(kubernetesClient, yamlMapper);
//        }
//    }

    @Autowired
    private ManageRayClusterService rayClusterService;

    @Test
    public void testUpdateRayCluster() {
        // 먼저 생성
        RayCluster rayCluster = new RayCluster();
        rayCluster.setMetadata(new ObjectMetaBuilder()
                .withName("test-raycluster")
                .withNamespace("default")
                .build());

        RayClusterSpec spec = new RayClusterSpec();
        rayCluster.setSpec(spec);
        rayClusterService.createRayCluster(rayCluster);

        // 수정
        rayCluster.getMetadata().setLabels(Map.of("env", "prod"));
        RayCluster updated = rayClusterService.updateRayCluster(rayCluster);

        assertNotNull(updated);
        assertEquals("prod", updated.getMetadata().getLabels().get("env"));
    }

    @Test
    public void testCreateRayClusterFromYaml() {
        // given
        String targetNamespace = "kuberay-test";

        // when
        RayCluster created = rayClusterService.createRayClusterFromYaml("cr/ray/rayclusettr.yaml", targetNamespace);

        // then
        assertNotNull(created);
        assertEquals(targetNamespace, created.getMetadata().getNamespace());
        assertNotNull(created.getMetadata().getName());
        System.out.println("[TEST] Created RayCluster: " + created.getMetadata().getName());
    }

}