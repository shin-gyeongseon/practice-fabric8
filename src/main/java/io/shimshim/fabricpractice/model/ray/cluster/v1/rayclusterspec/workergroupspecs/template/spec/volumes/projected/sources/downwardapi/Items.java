package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.volumes.projected.sources.downwardapi;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fieldRef","mode","path","resourceFieldRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Items implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("fieldRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.volumes.projected.sources.downwardapi.items.FieldRef fieldRef;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.volumes.projected.sources.downwardapi.items.FieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.volumes.projected.sources.downwardapi.items.FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer mode;

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceFieldRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.volumes.projected.sources.downwardapi.items.ResourceFieldRef resourceFieldRef;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.volumes.projected.sources.downwardapi.items.ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.volumes.projected.sources.downwardapi.items.ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }
}

