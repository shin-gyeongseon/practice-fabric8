package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.affinity.podaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"labelSelector","matchLabelKeys","mismatchLabelKeys","namespaceSelector","namespaces","topologyKey"})
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
public class RequiredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.builder.Editable<RequiredDuringSchedulingIgnoredDuringExecutionBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public RequiredDuringSchedulingIgnoredDuringExecutionBuilder edit() {
        return new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("labelSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.affinity.podaffinity.requiredduringschedulingignoredduringexecution.LabelSelector labelSelector;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.affinity.podaffinity.requiredduringschedulingignoredduringexecution.LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.affinity.podaffinity.requiredduringschedulingignoredduringexecution.LabelSelector labelSelector) {
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

    @com.fasterxml.jackson.annotation.JsonProperty("mismatchLabelKeys")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> mismatchLabelKeys;

    public java.util.List<String> getMismatchLabelKeys() {
        return mismatchLabelKeys;
    }

    public void setMismatchLabelKeys(java.util.List<String> mismatchLabelKeys) {
        this.mismatchLabelKeys = mismatchLabelKeys;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaceSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.affinity.podaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelector namespaceSelector;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.affinity.podaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.affinity.podaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaces")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> namespaces;

    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
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
}

