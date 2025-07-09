package io.shimshim.fabricpractice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientException;
import io.shimshim.fabricpractice.model.ray.cluster.v1.RayCluster;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Service
@Log4j
@RequiredArgsConstructor
public class ManageRayClusterService {

    private final KubernetesClient client;
    private final ObjectMapper yamlMapper;
    private static final String DEFAULT_RESOURCE_PATH = "cr/ray/ray-cluster.yaml";


    public RayCluster createRayCluster(RayCluster rayCluster) {
//        return client.resources(RayCluster.class)
//                .inNamespace(rayCluster.getMetadata().getNamespace())
//                .resource(rayCluster)
//                .create();

        try {
            RayCluster created = client.resources(RayCluster.class)
                    .inNamespace(rayCluster.getMetadata().getNamespace())
                    .resource(rayCluster)
                    .create();
            System.out.println("[INFO] RayCluster created: " + created.getMetadata().getName());
            return created;
        } catch (KubernetesClientException e) {
            System.err.println("[ERROR] Failed to create RayCluster: " + e.getMessage());
            if (e.getStatus() != null) {
                System.err.println("[DETAILS] Reason: " + e.getStatus().getReason());
                System.err.println("[DETAILS] Message: " + e.getStatus().getMessage());
                System.err.println("[DETAILS] Code: " + e.getStatus().getCode());
            }
            throw e;
        }
    }

    public RayCluster updateRayCluster(RayCluster rayCluster) {
        return client.resources(RayCluster.class)
                .inNamespace(rayCluster.getMetadata().getNamespace())
                .resource(rayCluster)
                .replace();
    }

    public RayCluster createRayClusterFromYaml(String resourcePath, String targetNamespace) {
        try {
            RayCluster rayCluster = loadRayClusterFromResource(resourcePath);

            if (rayCluster.getMetadata() != null) {
                rayCluster.getMetadata().setNamespace(targetNamespace);
            }

            RayCluster created = client.resources(RayCluster.class)
                    .inNamespace(targetNamespace)
                    .resource(rayCluster)
                    .create();

            System.out.println("[INFO] RayCluster created: " + created.getMetadata().getName());
            return created;
        } catch (IOException e) {
            System.err.println("[ERROR] Failed to read YAML: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (KubernetesClientException e) {
            System.err.println("[ERROR] Failed to create RayCluster: " + e.getMessage());
            if (e.getStatus() != null) {
                System.err.println("[DETAILS] Reason: " + e.getStatus().getReason());
                System.err.println("[DETAILS] Message: " + e.getStatus().getMessage());
                System.err.println("[DETAILS] Code: " + e.getStatus().getCode());
            }
            throw e;
        }
    }

    private RayCluster loadRayClusterFromResource(String resourcePath) throws IOException {
        // 1. Try to load from classpath (inside JAR)
        InputStream input = getClass().getClassLoader().getResourceAsStream(resourcePath);
        if (input != null) {
            return yamlMapper.readValue(input, RayCluster.class);
        }

        // 2. Fallback to file system (during development)
        File file = new File("src/main/resources/" + resourcePath);
        if (file.exists()) {
            return yamlMapper.readValue(file, RayCluster.class);
        }

        throw new IOException("YAML resource not found: " + resourcePath);
    }

}
