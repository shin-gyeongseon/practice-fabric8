package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clientIP"})
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
public class SessionAffinityConfig implements io.fabric8.kubernetes.api.builder.Editable<SessionAffinityConfigBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SessionAffinityConfigBuilder edit() {
        return new SessionAffinityConfigBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clientIP")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.sessionaffinityconfig.ClientIP clientIP;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.sessionaffinityconfig.ClientIP getClientIP() {
        return clientIP;
    }

    public void setClientIP(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.sessionaffinityconfig.ClientIP clientIP) {
        this.clientIP = clientIP;
    }
}

