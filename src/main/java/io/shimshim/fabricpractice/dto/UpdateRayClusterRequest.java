package io.shimshim.fabricpractice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UpdateRayClusterRequest {
    @JsonProperty("apiVersion")
    private String apiVersion;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("spec")
    private Spec spec;

    public UpdateRayClusterRequest() {
        this.apiVersion = "ray.io/v1alpha1";
        this.kind = "RayCluster";
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public static class Metadata {
        @JsonProperty("name")
        private String name;

        @JsonProperty("namespace")
        private String namespace;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNamespace() {
            return namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }
    }

    public static class Spec {
        @JsonProperty("headGroupSpec")
        private HeadGroupSpec headGroupSpec;

        @JsonProperty("workerGroupSpecs")
        private List<WorkerGroupSpec> workerGroupSpecs;

        public HeadGroupSpec getHeadGroupSpec() {
            return headGroupSpec;
        }

        public void setHeadGroupSpec(HeadGroupSpec headGroupSpec) {
            this.headGroupSpec = headGroupSpec;
        }

        public List<WorkerGroupSpec> getWorkerGroupSpecs() {
            return workerGroupSpecs;
        }

        public void setWorkerGroupSpecs(List<WorkerGroupSpec> workerGroupSpecs) {
            this.workerGroupSpecs = workerGroupSpecs;
        }
    }

    public static class HeadGroupSpec {
        @JsonProperty("replicas")
        private Integer replicas;

        @JsonProperty("rayStartParams")
        private RayStartParams rayStartParams;

        public Integer getReplicas() {
            return replicas;
        }

        public void setReplicas(Integer replicas) {
            this.replicas = replicas;
        }

        public RayStartParams getRayStartParams() {
            return rayStartParams;
        }

        public void setRayStartParams(RayStartParams rayStartParams) {
            this.rayStartParams = rayStartParams;
        }
    }

    public static class WorkerGroupSpec {
        @JsonProperty("groupName")
        private String groupName;

        @JsonProperty("replicas")
        private Integer replicas;

        @JsonProperty("minReplicas")
        private Integer minReplicas;

        @JsonProperty("maxReplicas")
        private Integer maxReplicas;

        @JsonProperty("rayStartParams")
        private RayStartParams rayStartParams;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public Integer getReplicas() {
            return replicas;
        }

        public void setReplicas(Integer replicas) {
            this.replicas = replicas;
        }

        public Integer getMinReplicas() {
            return minReplicas;
        }

        public void setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
        }

        public Integer getMaxReplicas() {
            return maxReplicas;
        }

        public void setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
        }

        public RayStartParams getRayStartParams() {
            return rayStartParams;
        }

        public void setRayStartParams(RayStartParams rayStartParams) {
            this.rayStartParams = rayStartParams;
        }
    }

    public static class RayStartParams {
        @JsonProperty("dashboard-host")
        private String dashboardHost;

        @JsonProperty("num-cpus")
        private String numCpus;

        public String getDashboardHost() {
            return dashboardHost;
        }

        public void setDashboardHost(String dashboardHost) {
            this.dashboardHost = dashboardHost;
        }

        public String getNumCpus() {
            return numCpus;
        }

        public void setNumCpus(String numCpus) {
            this.numCpus = numCpus;
        }
    }
}