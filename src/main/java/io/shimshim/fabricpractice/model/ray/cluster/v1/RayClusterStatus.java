package io.shimshim.fabricpractice.model.ray.cluster.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"availableWorkerReplicas","conditions","desiredCPU","desiredGPU","desiredMemory","desiredTPU","desiredWorkerReplicas","endpoints","head","lastUpdateTime","maxWorkerReplicas","minWorkerReplicas","observedGeneration","readyWorkerReplicas","reason","state","stateTransitionTimes"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class RayClusterStatus implements io.fabric8.kubernetes.api.builder.Editable<RayClusterStatusBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public RayClusterStatusBuilder edit() {
        return new RayClusterStatusBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availableWorkerReplicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer availableWorkerReplicas;

    public Integer getAvailableWorkerReplicas() {
        return availableWorkerReplicas;
    }

    public void setAvailableWorkerReplicas(Integer availableWorkerReplicas) {
        this.availableWorkerReplicas = availableWorkerReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterstatus.Conditions> conditions;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("desiredCPU")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString desiredCPU;

    public io.fabric8.kubernetes.api.model.IntOrString getDesiredCPU() {
        return desiredCPU;
    }

    public void setDesiredCPU(io.fabric8.kubernetes.api.model.IntOrString desiredCPU) {
        this.desiredCPU = desiredCPU;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("desiredGPU")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString desiredGPU;

    public io.fabric8.kubernetes.api.model.IntOrString getDesiredGPU() {
        return desiredGPU;
    }

    public void setDesiredGPU(io.fabric8.kubernetes.api.model.IntOrString desiredGPU) {
        this.desiredGPU = desiredGPU;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("desiredMemory")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString desiredMemory;

    public io.fabric8.kubernetes.api.model.IntOrString getDesiredMemory() {
        return desiredMemory;
    }

    public void setDesiredMemory(io.fabric8.kubernetes.api.model.IntOrString desiredMemory) {
        this.desiredMemory = desiredMemory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("desiredTPU")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString desiredTPU;

    public io.fabric8.kubernetes.api.model.IntOrString getDesiredTPU() {
        return desiredTPU;
    }

    public void setDesiredTPU(io.fabric8.kubernetes.api.model.IntOrString desiredTPU) {
        this.desiredTPU = desiredTPU;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("desiredWorkerReplicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer desiredWorkerReplicas;

    public Integer getDesiredWorkerReplicas() {
        return desiredWorkerReplicas;
    }

    public void setDesiredWorkerReplicas(Integer desiredWorkerReplicas) {
        this.desiredWorkerReplicas = desiredWorkerReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> endpoints;

    public java.util.Map<java.lang.String, String> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(java.util.Map<java.lang.String, String> endpoints) {
        this.endpoints = endpoints;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("head")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterstatus.Head head;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterstatus.Head getHead() {
        return head;
    }

    public void setHead(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterstatus.Head head) {
        this.head = head;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.time.ZonedDateTime lastUpdateTime;

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setLastUpdateTime(java.time.ZonedDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxWorkerReplicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer maxWorkerReplicas;

    public Integer getMaxWorkerReplicas() {
        return maxWorkerReplicas;
    }

    public void setMaxWorkerReplicas(Integer maxWorkerReplicas) {
        this.maxWorkerReplicas = maxWorkerReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minWorkerReplicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer minWorkerReplicas;

    public Integer getMinWorkerReplicas() {
        return minWorkerReplicas;
    }

    public void setMinWorkerReplicas(Integer minWorkerReplicas) {
        this.minWorkerReplicas = minWorkerReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readyWorkerReplicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readyWorkerReplicas;

    public Integer getReadyWorkerReplicas() {
        return readyWorkerReplicas;
    }

    public void setReadyWorkerReplicas(Integer readyWorkerReplicas) {
        this.readyWorkerReplicas = readyWorkerReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("state")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stateTransitionTimes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, java.time.ZonedDateTime> stateTransitionTimes;

    public java.util.Map<java.lang.String, java.time.ZonedDateTime> getStateTransitionTimes() {
        return stateTransitionTimes;
    }

    public void setStateTransitionTimes(java.util.Map<java.lang.String, java.time.ZonedDateTime> stateTransitionTimes) {
        this.stateTransitionTimes = stateTransitionTimes;
    }
}

