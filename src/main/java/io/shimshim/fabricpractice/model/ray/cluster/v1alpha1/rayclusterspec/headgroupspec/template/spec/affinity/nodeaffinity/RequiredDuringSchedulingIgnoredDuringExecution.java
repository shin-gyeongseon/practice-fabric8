package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.nodeaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeSelectorTerms"})
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

    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelectorTerms")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms;

    public java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(java.util.List<io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }
}

