package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.ephemeralcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"mountPath","mountPropagation","name","readOnly","recursiveReadOnly","subPath","subPathExpr"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class VolumeMounts implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("mountPath")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mountPath;

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mountPropagation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mountPropagation;

    public String getMountPropagation() {
        return mountPropagation;
    }

    public void setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recursiveReadOnly")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String recursiveReadOnly;

    public String getRecursiveReadOnly() {
        return recursiveReadOnly;
    }

    public void setRecursiveReadOnly(String recursiveReadOnly) {
        this.recursiveReadOnly = recursiveReadOnly;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subPath")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subPath;

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subPathExpr")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subPathExpr;

    public String getSubPathExpr() {
        return subPathExpr;
    }

    public void setSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }
}

