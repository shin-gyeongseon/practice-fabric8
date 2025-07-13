package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"value","valueFrom"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RedisPassword implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("valueFrom")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.redispassword.ValueFrom valueFrom;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.redispassword.ValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.redispassword.ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }
}

