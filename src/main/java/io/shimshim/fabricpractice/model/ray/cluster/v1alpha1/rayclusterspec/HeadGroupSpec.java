package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"enableIngress","headService","rayStartParams","serviceType","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class HeadGroupSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.HeadService headService;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.HeadService getHeadService() {
        return headService;
    }

    public void setHeadService(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.HeadService headService) {
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
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.Template template;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.Template template) {
        this.template = template;
    }
}

