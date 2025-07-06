package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"matchExpressions","matchLabels"})
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
public class LabelSelector implements io.fabric8.kubernetes.api.builder.Editable<LabelSelectorBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public LabelSelectorBuilder edit() {
        return new LabelSelectorBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.labelselector.MatchExpressions> matchExpressions;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.labelselector.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.labelselector.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchLabels")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> matchLabels;

    public java.util.Map<java.lang.String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(java.util.Map<java.lang.String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }
}

