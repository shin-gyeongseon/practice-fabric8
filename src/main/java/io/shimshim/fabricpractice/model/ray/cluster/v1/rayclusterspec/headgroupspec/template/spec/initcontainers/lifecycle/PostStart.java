package io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exec","httpGet","sleep","tcpSocket"})
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
public class PostStart implements io.fabric8.kubernetes.api.builder.Editable<PostStartBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public PostStartBuilder edit() {
        return new PostStartBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.Exec exec;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.Exec getExec() {
        return exec;
    }

    public void setExec(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.Exec exec) {
        this.exec = exec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.HttpGet httpGet;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sleep")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.Sleep sleep;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.Sleep getSleep() {
        return sleep;
    }

    public void setSleep(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.Sleep sleep) {
        this.sleep = sleep;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.TcpSocket tcpSocket;

    public io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(io.shimshim.fabricpractice.model.ray.cluster.v1.rayclusterspec.headgroupspec.template.spec.initcontainers.lifecycle.poststart.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}

