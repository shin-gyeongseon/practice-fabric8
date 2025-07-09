package io.shimshim.fabricpractice.service;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.shimshim.fabricpractice.config.KubernetesClientConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ManagePodServiceTest.TestConfig.class})
class ManagePodServiceTest {

    @TestConfiguration
    static class TestConfig {
        @Bean
        public KubernetesClient kubernetesClient() {
            KubernetesClientConfig kubernetesClientConfig = new KubernetesClientConfig();
            return kubernetesClientConfig.buildKubernetesClient();
        }

        @Bean
        public ManagePodService managePodService(KubernetesClient kubernetesClient) {
            return new ManagePodService(kubernetesClient);
        }
    }

    @Autowired
    private ManagePodService managePodService;

    @Test
    void test() {
        managePodService.getAllPodInDefaultCluster();
    }

}