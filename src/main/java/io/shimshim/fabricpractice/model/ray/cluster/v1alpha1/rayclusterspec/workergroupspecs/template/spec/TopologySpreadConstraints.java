package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"labelSelector","matchLabelKeys","maxSkew","minDomains","nodeAffinityPolicy","nodeTaintsPolicy","topologyKey","whenUnsatisfiable"})
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
public class TopologySpreadConstraints implements io.fabric8.kubernetes.api.builder.Editable<TopologySpreadConstraintsBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public TopologySpreadConstraintsBuilder edit() {
        return new TopologySpreadConstraintsBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("labelSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.topologyspreadconstraints.LabelSelector labelSelector;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.topologyspreadconstraints.LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.topologyspreadconstraints.LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchLabelKeys")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> matchLabelKeys;

    public java.util.List<String> getMatchLabelKeys() {
        return matchLabelKeys;
    }

    public void setMatchLabelKeys(java.util.List<String> matchLabelKeys) {
        this.matchLabelKeys = matchLabelKeys;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxSkew")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer maxSkew;

    public Integer getMaxSkew() {
        return maxSkew;
    }

    public void setMaxSkew(Integer maxSkew) {
        this.maxSkew = maxSkew;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minDomains")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer minDomains;

    public Integer getMinDomains() {
        return minDomains;
    }

    public void setMinDomains(Integer minDomains) {
        this.minDomains = minDomains;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinityPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nodeAffinityPolicy;

    public String getNodeAffinityPolicy() {
        return nodeAffinityPolicy;
    }

    public void setNodeAffinityPolicy(String nodeAffinityPolicy) {
        this.nodeAffinityPolicy = nodeAffinityPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeTaintsPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nodeTaintsPolicy;

    public String getNodeTaintsPolicy() {
        return nodeTaintsPolicy;
    }

    public void setNodeTaintsPolicy(String nodeTaintsPolicy) {
        this.nodeTaintsPolicy = nodeTaintsPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("topologyKey")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String topologyKey;

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("whenUnsatisfiable")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String whenUnsatisfiable;

    public String getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(String whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
    }
}

