package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"volumeClaimTemplate"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ephemeral implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("volumeClaimTemplate")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes.ephemeral.VolumeClaimTemplate volumeClaimTemplate;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes.ephemeral.VolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes.ephemeral.VolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }
}

