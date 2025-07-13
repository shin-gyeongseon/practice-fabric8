package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"groupName","idleTimeoutSeconds","maxReplicas","minReplicas","numOfHosts","rayStartParams","replicas","scaleStrategy","suspend","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class WorkerGroupSpecs implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer idleTimeoutSeconds;

    public Integer getIdleTimeoutSeconds() {
        return idleTimeoutSeconds;
    }

    public void setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
        this.idleTimeoutSeconds = idleTimeoutSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxReplicas")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer maxReplicas = 2147483647;

    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minReplicas")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer minReplicas = 0;

    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("numOfHosts")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer numOfHosts = 1;

    public Integer getNumOfHosts() {
        return numOfHosts;
    }

    public void setNumOfHosts(Integer numOfHosts) {
        this.numOfHosts = numOfHosts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rayStartParams")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> rayStartParams;

    public java.util.Map<java.lang.String, String> getRayStartParams() {
        return rayStartParams;
    }

    public void setRayStartParams(java.util.Map<java.lang.String, String> rayStartParams) {
        this.rayStartParams = rayStartParams;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas = 0;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleStrategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.ScaleStrategy scaleStrategy;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.ScaleStrategy getScaleStrategy() {
        return scaleStrategy;
    }

    public void setScaleStrategy(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.ScaleStrategy scaleStrategy) {
        this.scaleStrategy = scaleStrategy;
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

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.Template template;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.Template template) {
        this.template = template;
    }
}

