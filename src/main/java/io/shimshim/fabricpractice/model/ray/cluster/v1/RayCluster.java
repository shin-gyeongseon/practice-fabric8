package io.shimshim.fabricpractice.model.ray.cluster.v1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("ray.io")
@io.fabric8.kubernetes.model.annotation.Singular("raycluster")
@io.fabric8.kubernetes.model.annotation.Plural("rayclusters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RayCluster extends io.fabric8.kubernetes.client.CustomResource<io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterSpec, io.shimshim.fabricpractice.model.ray.cluster.v1.RayClusterStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

