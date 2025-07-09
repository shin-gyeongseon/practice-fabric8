package io.shimshim.fabricpractice.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ServeConfigV2 {
    private List<ApplicationConfig> applications;

    @Data
    public static class ApplicationConfig {
        private String name;
        private String importPath;
        private String routePrefix;
        private Map<String, Object> runtimeEnv; // 유연하게 처리
        private List<DeploymentConfig> deployments;
    }

    @Data
    public static class DeploymentConfig {
        private String name;
        private Integer numReplicas;
        private Map<String, Object> userConfig; // 가격, 세부 설정 등
        private Map<String, Object> rayActorOptions; // num_cpus, memory 등
    }
}
