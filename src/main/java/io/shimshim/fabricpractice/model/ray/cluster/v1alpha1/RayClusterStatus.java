package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"availableWorkerReplicas","desiredCPU","desiredGPU","desiredMemory","desiredTPU","desiredWorkerReplicas","endpoints","head","lastUpdateTime","maxWorkerReplicas","minWorkerReplicas","observedGeneration","readyWorkerReplicas","reason","state"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RayClusterStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("availableWorkerReplicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer availableWorkerReplicas;

    public Integer getAvailableWorkerReplicas() {
        return availableWorkerReplicas;
    }

    public void setAvailableWorkerReplicas(Integer availableWorkerReplicas) {
        this.availableWorkerReplicas = availableWorkerReplicas;
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
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterstatus.Head head;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterstatus.Head getHead() {
        return head;
    }

    public void setHead(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterstatus.Head head) {
        this.head = head;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String lastUpdateTime;

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
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
}

