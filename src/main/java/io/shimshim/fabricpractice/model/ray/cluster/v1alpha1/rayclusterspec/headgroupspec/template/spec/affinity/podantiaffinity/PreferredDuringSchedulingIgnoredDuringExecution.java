package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"podAffinityTerm","weight"})
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
public class PreferredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.builder.Editable<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public PreferredDuringSchedulingIgnoredDuringExecutionBuilder edit() {
        return new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("podAffinityTerm")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm podAffinityTerm;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.headgroupspec.template.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

