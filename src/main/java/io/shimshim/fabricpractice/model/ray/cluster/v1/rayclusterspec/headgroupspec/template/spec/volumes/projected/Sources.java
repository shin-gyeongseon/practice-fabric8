package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterTrustBundle","configMap","downwardAPI","secret","serviceAccountToken"})
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
public class Sources implements io.fabric8.kubernetes.api.builder.Editable<SourcesBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SourcesBuilder edit() {
        return new SourcesBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterTrustBundle")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ClusterTrustBundle clusterTrustBundle;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ClusterTrustBundle getClusterTrustBundle() {
        return clusterTrustBundle;
    }

    public void setClusterTrustBundle(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ClusterTrustBundle clusterTrustBundle) {
        this.clusterTrustBundle = clusterTrustBundle;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ConfigMap configMap;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ConfigMap configMap) {
        this.configMap = configMap;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.DownwardAPI downwardAPI;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.Secret secret;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.Secret getSecret() {
        return secret;
    }

    public void setSecret(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.Secret secret) {
        this.secret = secret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountToken")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ServiceAccountToken serviceAccountToken;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.projected.sources.ServiceAccountToken serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }
}

