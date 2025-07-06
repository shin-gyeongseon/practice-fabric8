package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"env","envFrom","idleTimeoutSeconds","image","imagePullPolicy","resources","securityContext","upscalingMode","volumeMounts"})
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
public class AutoscalerOptions implements io.fabric8.kubernetes.api.builder.Editable<AutoscalerOptionsBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public AutoscalerOptionsBuilder edit() {
        return new AutoscalerOptionsBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.Env> env;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.Env> env) {
        this.env = env;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("envFrom")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.EnvFrom> envFrom;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.EnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.EnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer idleTimeoutSeconds;

    public Integer getIdleTimeoutSeconds() {
        return idleTimeoutSeconds;
    }

    public void setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
        this.idleTimeoutSeconds = idleTimeoutSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imagePullPolicy;

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.Resources resources;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.Resources getResources() {
        return resources;
    }

    public void setResources(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.Resources resources) {
        this.resources = resources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.SecurityContext securityContext;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public enum UpscalingMode {

        @com.fasterxml.jackson.annotation.JsonProperty("Default")
        DEFAULT("Default"), @com.fasterxml.jackson.annotation.JsonProperty("Aggressive")
        AGGRESSIVE("Aggressive"), @com.fasterxml.jackson.annotation.JsonProperty("Conservative")
        CONSERVATIVE("Conservative");

        java.lang.String value;

        UpscalingMode(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    @com.fasterxml.jackson.annotation.JsonProperty("upscalingMode")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private UpscalingMode upscalingMode;

    public UpscalingMode getUpscalingMode() {
        return upscalingMode;
    }

    public void setUpscalingMode(UpscalingMode upscalingMode) {
        this.upscalingMode = upscalingMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.VolumeMounts> volumeMounts;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.VolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.autoscaleroptions.VolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }
}

