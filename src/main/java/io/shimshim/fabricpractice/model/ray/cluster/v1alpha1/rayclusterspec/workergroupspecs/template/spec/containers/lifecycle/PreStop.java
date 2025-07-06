package io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle;

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
public class PreStop implements io.fabric8.kubernetes.api.builder.Editable<PreStopBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public PreStopBuilder edit() {
        return new PreStopBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.Exec exec;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.Exec getExec() {
        return exec;
    }

    public void setExec(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.Exec exec) {
        this.exec = exec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.HttpGet httpGet;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sleep")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.Sleep sleep;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.Sleep getSleep() {
        return sleep;
    }

    public void setSleep(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.Sleep sleep) {
        this.sleep = sleep;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.TcpSocket tcpSocket;

    public io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(io.shimshim.fabricpractice.model.ray.cluster.v1alpha1.rayclusterspec.workergroupspecs.template.spec.containers.lifecycle.prestop.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}

