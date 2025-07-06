package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allocateLoadBalancerNodePorts","clusterIP","clusterIPs","externalIPs","externalName","externalTrafficPolicy","healthCheckNodePort","internalTrafficPolicy","ipFamilies","ipFamilyPolicy","loadBalancerClass","loadBalancerIP","loadBalancerSourceRanges","ports","publishNotReadyAddresses","selector","sessionAffinity","sessionAffinityConfig","trafficDistribution","type"})
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
public class Spec implements io.fabric8.kubernetes.api.builder.Editable<SpecBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SpecBuilder edit() {
        return new SpecBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("allocateLoadBalancerNodePorts")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allocateLoadBalancerNodePorts;

    public Boolean getAllocateLoadBalancerNodePorts() {
        return allocateLoadBalancerNodePorts;
    }

    public void setAllocateLoadBalancerNodePorts(Boolean allocateLoadBalancerNodePorts) {
        this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterIP")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clusterIP;

    public String getClusterIP() {
        return clusterIP;
    }

    public void setClusterIP(String clusterIP) {
        this.clusterIP = clusterIP;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterIPs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> clusterIPs;

    public java.util.List<String> getClusterIPs() {
        return clusterIPs;
    }

    public void setClusterIPs(java.util.List<String> clusterIPs) {
        this.clusterIPs = clusterIPs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("externalIPs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> externalIPs;

    public java.util.List<String> getExternalIPs() {
        return externalIPs;
    }

    public void setExternalIPs(java.util.List<String> externalIPs) {
        this.externalIPs = externalIPs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("externalName")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String externalName;

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("externalTrafficPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String externalTrafficPolicy;

    public String getExternalTrafficPolicy() {
        return externalTrafficPolicy;
    }

    public void setExternalTrafficPolicy(String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckNodePort")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer healthCheckNodePort;

    public Integer getHealthCheckNodePort() {
        return healthCheckNodePort;
    }

    public void setHealthCheckNodePort(Integer healthCheckNodePort) {
        this.healthCheckNodePort = healthCheckNodePort;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("internalTrafficPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String internalTrafficPolicy;

    public String getInternalTrafficPolicy() {
        return internalTrafficPolicy;
    }

    public void setInternalTrafficPolicy(String internalTrafficPolicy) {
        this.internalTrafficPolicy = internalTrafficPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ipFamilies")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> ipFamilies;

    public java.util.List<String> getIpFamilies() {
        return ipFamilies;
    }

    public void setIpFamilies(java.util.List<String> ipFamilies) {
        this.ipFamilies = ipFamilies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ipFamilyPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ipFamilyPolicy;

    public String getIpFamilyPolicy() {
        return ipFamilyPolicy;
    }

    public void setIpFamilyPolicy(String ipFamilyPolicy) {
        this.ipFamilyPolicy = ipFamilyPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerClass")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String loadBalancerClass;

    public String getLoadBalancerClass() {
        return loadBalancerClass;
    }

    public void setLoadBalancerClass(String loadBalancerClass) {
        this.loadBalancerClass = loadBalancerClass;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerIP")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String loadBalancerIP;

    public String getLoadBalancerIP() {
        return loadBalancerIP;
    }

    public void setLoadBalancerIP(String loadBalancerIP) {
        this.loadBalancerIP = loadBalancerIP;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerSourceRanges")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> loadBalancerSourceRanges;

    public java.util.List<String> getLoadBalancerSourceRanges() {
        return loadBalancerSourceRanges;
    }

    public void setLoadBalancerSourceRanges(java.util.List<String> loadBalancerSourceRanges) {
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.Ports> ports;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.Ports> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.Ports> ports) {
        this.ports = ports;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("publishNotReadyAddresses")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean publishNotReadyAddresses;

    public Boolean getPublishNotReadyAddresses() {
        return publishNotReadyAddresses;
    }

    public void setPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
        this.publishNotReadyAddresses = publishNotReadyAddresses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> selector;

    public java.util.Map<java.lang.String, String> getSelector() {
        return selector;
    }

    public void setSelector(java.util.Map<java.lang.String, String> selector) {
        this.selector = selector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionAffinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sessionAffinity;

    public String getSessionAffinity() {
        return sessionAffinity;
    }

    public void setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionAffinityConfig")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.SessionAffinityConfig sessionAffinityConfig;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.SessionAffinityConfig getSessionAffinityConfig() {
        return sessionAffinityConfig;
    }

    public void setSessionAffinityConfig(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.headservice.spec.SessionAffinityConfig sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("trafficDistribution")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String trafficDistribution;

    public String getTrafficDistribution() {
        return trafficDistribution;
    }

    public void setTrafficDistribution(String trafficDistribution) {
        this.trafficDistribution = trafficDistribution;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

