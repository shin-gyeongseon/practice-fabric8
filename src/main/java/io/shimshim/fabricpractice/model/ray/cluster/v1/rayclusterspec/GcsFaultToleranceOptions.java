package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"externalStorageNamespace","redisAddress","redisPassword","redisUsername"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class GcsFaultToleranceOptions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("externalStorageNamespace")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String externalStorageNamespace;

    public String getExternalStorageNamespace() {
        return externalStorageNamespace;
    }

    public void setExternalStorageNamespace(String externalStorageNamespace) {
        this.externalStorageNamespace = externalStorageNamespace;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("redisAddress")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String redisAddress;

    public String getRedisAddress() {
        return redisAddress;
    }

    public void setRedisAddress(String redisAddress) {
        this.redisAddress = redisAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("redisPassword")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.RedisPassword redisPassword;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.RedisPassword getRedisPassword() {
        return redisPassword;
    }

    public void setRedisPassword(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.RedisPassword redisPassword) {
        this.redisPassword = redisPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("redisUsername")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.RedisUsername redisUsername;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.RedisUsername getRedisUsername() {
        return redisUsername;
    }

    public void setRedisUsername(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.gcsfaulttoleranceoptions.RedisUsername redisUsername) {
        this.redisUsername = redisUsername;
    }
}

