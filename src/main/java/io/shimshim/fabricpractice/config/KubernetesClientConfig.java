package io.shimshim.fabricpractice.config;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KubernetesClientConfig {

    @Bean
    public KubernetesClient buildKubernetesClient() {
        KubernetesClient client = new KubernetesClientBuilder().build();
        return client;
    }
}
