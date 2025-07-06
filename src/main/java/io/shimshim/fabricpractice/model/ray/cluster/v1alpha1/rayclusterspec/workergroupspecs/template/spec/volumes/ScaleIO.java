package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fsType","gateway","protectionDomain","readOnly","secretRef","sslEnabled","storageMode","storagePool","system","volumeName"})
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
public class ScaleIO implements io.fabric8.kubernetes.api.builder.Editable<ScaleIOBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ScaleIOBuilder edit() {
        return new ScaleIOBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType = "xfs";

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String gateway;

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("protectionDomain")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String protectionDomain;

    public String getProtectionDomain() {
        return protectionDomain;
    }

    public void setProtectionDomain(String protectionDomain) {
        this.protectionDomain = protectionDomain;
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

    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes.scaleio.SecretRef secretRef;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes.scaleio.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.volumes.scaleio.SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslEnabled")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean sslEnabled;

    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageMode")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageMode = "ThinProvisioned";

    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storagePool")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storagePool;

    public String getStoragePool() {
        return storagePool;
    }

    public void setStoragePool(String storagePool) {
        this.storagePool = storagePool;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("system")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String system;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("volumeName")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeName;

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
}

