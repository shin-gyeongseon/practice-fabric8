package io.shimshim.fabricpractice.model.ray.cluster.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"autoscalerOptions","enableInTreeAutoscaling","gcsFaultToleranceOptions","headGroupSpec","headServiceAnnotations","managedBy","rayVersion","suspend","workerGroupSpecs"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RayClusterSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("autoscalerOptions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.AutoscalerOptions autoscalerOptions;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.AutoscalerOptions getAutoscalerOptions() {
        return autoscalerOptions;
    }

    public void setAutoscalerOptions(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.AutoscalerOptions autoscalerOptions) {
        this.autoscalerOptions = autoscalerOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("enableInTreeAutoscaling")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableInTreeAutoscaling;

    public Boolean getEnableInTreeAutoscaling() {
        return enableInTreeAutoscaling;
    }

    public void setEnableInTreeAutoscaling(Boolean enableInTreeAutoscaling) {
        this.enableInTreeAutoscaling = enableInTreeAutoscaling;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gcsFaultToleranceOptions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.GcsFaultToleranceOptions gcsFaultToleranceOptions;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.GcsFaultToleranceOptions getGcsFaultToleranceOptions() {
        return gcsFaultToleranceOptions;
    }

    public void setGcsFaultToleranceOptions(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.GcsFaultToleranceOptions gcsFaultToleranceOptions) {
        this.gcsFaultToleranceOptions = gcsFaultToleranceOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("headGroupSpec")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.HeadGroupSpec headGroupSpec;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.HeadGroupSpec getHeadGroupSpec() {
        return headGroupSpec;
    }

    public void setHeadGroupSpec(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.HeadGroupSpec headGroupSpec) {
        this.headGroupSpec = headGroupSpec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("headServiceAnnotations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> headServiceAnnotations;

    public java.util.Map<java.lang.String, String> getHeadServiceAnnotations() {
        return headServiceAnnotations;
    }

    public void setHeadServiceAnnotations(java.util.Map<java.lang.String, String> headServiceAnnotations) {
        this.headServiceAnnotations = headServiceAnnotations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managedBy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String managedBy;

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rayVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String rayVersion;

    public String getRayVersion() {
        return rayVersion;
    }

    public void setRayVersion(String rayVersion) {
        this.rayVersion = rayVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("suspend")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean suspend;

    public Boolean getSuspend() {
        return suspend;
    }

    public void setSuspend(Boolean suspend) {
        this.suspend = suspend;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workerGroupSpecs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.WorkerGroupSpecs> workerGroupSpecs;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.WorkerGroupSpecs> getWorkerGroupSpecs() {
        return workerGroupSpecs;
    }

    public void setWorkerGroupSpecs(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.WorkerGroupSpecs> workerGroupSpecs) {
        this.workerGroupSpecs = workerGroupSpecs;
    }
}

