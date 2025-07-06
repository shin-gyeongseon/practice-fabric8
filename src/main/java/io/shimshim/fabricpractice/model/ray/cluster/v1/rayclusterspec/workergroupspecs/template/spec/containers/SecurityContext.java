package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allowPrivilegeEscalation","appArmorProfile","capabilities","privileged","procMount","readOnlyRootFilesystem","runAsGroup","runAsNonRoot","runAsUser","seLinuxOptions","seccompProfile","windowsOptions"})
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
public class SecurityContext implements io.fabric8.kubernetes.api.builder.Editable<SecurityContextBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SecurityContextBuilder edit() {
        return new SecurityContextBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("allowPrivilegeEscalation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allowPrivilegeEscalation;

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("appArmorProfile")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.AppArmorProfile appArmorProfile;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.AppArmorProfile getAppArmorProfile() {
        return appArmorProfile;
    }

    public void setAppArmorProfile(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.AppArmorProfile appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.Capabilities capabilities;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privileged")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean privileged;

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("procMount")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String procMount;

    public String getProcMount() {
        return procMount;
    }

    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readOnlyRootFilesystem")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnlyRootFilesystem;

    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runAsGroup")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long runAsGroup;

    public Long getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runAsNonRoot")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean runAsNonRoot;

    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long runAsUser;

    public Long getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("seLinuxOptions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.SeLinuxOptions seLinuxOptions;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.SeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.SeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("seccompProfile")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.SeccompProfile seccompProfile;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.SeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("windowsOptions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.WindowsOptions windowsOptions;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.WindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.workergroupspecs.template.spec.containers.securitycontext.WindowsOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }
}

