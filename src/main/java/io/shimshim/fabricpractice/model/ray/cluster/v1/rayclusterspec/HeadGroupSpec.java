package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"enableIngress","headService","rayStartParams","serviceType","template"})
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
public class HeadGroupSpec implements io.fabric8.kubernetes.api.builder.Editable<HeadGroupSpecBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public HeadGroupSpecBuilder edit() {
        return new HeadGroupSpecBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("enableIngress")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableIngress;

    public Boolean getEnableIngress() {
        return enableIngress;
    }

    public void setEnableIngress(Boolean enableIngress) {
        this.enableIngress = enableIngress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("headService")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.HeadService headService;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.HeadService getHeadService() {
        return headService;
    }

    public void setHeadService(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.HeadService headService) {
        this.headService = headService;
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

    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceType;

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.Template template;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.Template template) {
        this.template = template;
    }
}

