package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditions","loadBalancer"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.status.Conditions> conditions;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.status.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.status.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.status.LoadBalancer loadBalancer;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.status.LoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.status.LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }
}

