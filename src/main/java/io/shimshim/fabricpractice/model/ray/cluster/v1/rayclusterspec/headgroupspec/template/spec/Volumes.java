package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"awsElasticBlockStore","azureDisk","azureFile","cephfs","cinder","configMap","csi","downwardAPI","emptyDir","ephemeral","fc","flexVolume","flocker","gcePersistentDisk","gitRepo","glusterfs","hostPath","image","iscsi","name","nfs","persistentVolumeClaim","photonPersistentDisk","portworxVolume","projected","quobyte","rbd","scaleIO","secret","storageos","vsphereVolume"})
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
public class Volumes implements io.fabric8.kubernetes.api.builder.Editable<VolumesBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public VolumesBuilder edit() {
        return new VolumesBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("awsElasticBlockStore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AwsElasticBlockStore awsElasticBlockStore;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("azureDisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AzureDisk azureDisk;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("azureFile")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AzureFile azureFile;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.AzureFile azureFile) {
        this.azureFile = azureFile;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cephfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Cephfs cephfs;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Cephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Cephfs cephfs) {
        this.cephfs = cephfs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cinder")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Cinder cinder;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Cinder getCinder() {
        return cinder;
    }

    public void setCinder(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Cinder cinder) {
        this.cinder = cinder;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.ConfigMap configMap;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.ConfigMap configMap) {
        this.configMap = configMap;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Csi csi;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Csi getCsi() {
        return csi;
    }

    public void setCsi(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Csi csi) {
        this.csi = csi;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.DownwardAPI downwardAPI;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("emptyDir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.EmptyDir emptyDir;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.EmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Ephemeral ephemeral;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Ephemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Ephemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fc")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Fc fc;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Fc getFc() {
        return fc;
    }

    public void setFc(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Fc fc) {
        this.fc = fc;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flexVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.FlexVolume flexVolume;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.FlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.FlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flocker")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Flocker flocker;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Flocker getFlocker() {
        return flocker;
    }

    public void setFlocker(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Flocker flocker) {
        this.flocker = flocker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gcePersistentDisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.GcePersistentDisk gcePersistentDisk;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.GcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.GcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gitRepo")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.GitRepo gitRepo;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.GitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("glusterfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Glusterfs glusterfs;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Glusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Glusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hostPath")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.HostPath hostPath;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.HostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.HostPath hostPath) {
        this.hostPath = hostPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Image image;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Image getImage() {
        return image;
    }

    public void setImage(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Image image) {
        this.image = image;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Iscsi iscsi;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Iscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Iscsi iscsi) {
        this.iscsi = iscsi;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Nfs nfs;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Nfs getNfs() {
        return nfs;
    }

    public void setNfs(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Nfs nfs) {
        this.nfs = nfs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PersistentVolumeClaim persistentVolumeClaim;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("photonPersistentDisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PhotonPersistentDisk photonPersistentDisk;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("portworxVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PortworxVolume portworxVolume;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.PortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("projected")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Projected projected;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Projected getProjected() {
        return projected;
    }

    public void setProjected(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Projected projected) {
        this.projected = projected;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("quobyte")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Quobyte quobyte;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Quobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Quobyte quobyte) {
        this.quobyte = quobyte;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rbd")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Rbd rbd;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Rbd getRbd() {
        return rbd;
    }

    public void setRbd(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Rbd rbd) {
        this.rbd = rbd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleIO")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.ScaleIO scaleIO;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.ScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.ScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Secret secret;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Secret getSecret() {
        return secret;
    }

    public void setSecret(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Secret secret) {
        this.secret = secret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageos")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Storageos storageos;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Storageos getStorageos() {
        return storageos;
    }

    public void setStorageos(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.Storageos storageos) {
        this.storageos = storageos;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.VsphereVolume vsphereVolume;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.VsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.volumes.VsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }
}

