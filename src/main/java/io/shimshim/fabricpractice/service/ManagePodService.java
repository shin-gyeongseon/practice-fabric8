package io.shimshim.fabricpractice.service;

import io.fabric8.kubernetes.client.KubernetesClient;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ManagePodService {
    private final KubernetesClient client;

    public ManagePodService(KubernetesClient client) {
        this.client = client;
    }

    public void getAllPodInDefaultCluster() {
        client.pods().inNamespace("default").list().getItems().forEach(pod -> {
            System.out.println(pod.getMetadata().getName());
        });
    }

    public String createPod() {
        client.pods().inNamespace("default").list().getItems().forEach(pod -> {
            System.out.println(pod.getMetadata().getName());
        });

        return "stup-create-pod";
    }


}
