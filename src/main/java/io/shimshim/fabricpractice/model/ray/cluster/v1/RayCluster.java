package io.shimshim.fabricpractice.model.ray.cluster.v1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("ray.io")
@io.fabric8.kubernetes.model.annotation.Singular("raycluster")
@io.fabric8.kubernetes.model.annotation.Plural("rayclusters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
@lombok.ToString()
@lombok.EqualsAndHashCode(callSuper = true)
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
public class RayCluster extends io.fabric8.kubernetes.client.CustomResource<io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterSpec, io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterStatus> implements io.fabric8.kubernetes.api.model.Namespaced, io.fabric8.kubernetes.api.builder.Editable<RayClusterBuilder> {

    @java.lang.Override
    public RayClusterBuilder edit() {
        return new RayClusterBuilder(this);
    }
}

