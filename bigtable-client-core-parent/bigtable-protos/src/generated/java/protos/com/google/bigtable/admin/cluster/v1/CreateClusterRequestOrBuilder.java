// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/cluster/v1/bigtable_cluster_service_messages.proto

package com.google.bigtable.admin.cluster.v1;

public interface CreateClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.cluster.v1.CreateClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique name of the zone in which to create the cluster.
   * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique name of the zone in which to create the cluster.
   * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The id to be used when referring to the new cluster within its zone,
   * e.g. just the "test-cluster" section of the full name
   * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
   * </pre>
   *
   * <code>optional string cluster_id = 2;</code>
   */
  java.lang.String getClusterId();
  /**
   * <pre>
   * The id to be used when referring to the new cluster within its zone,
   * e.g. just the "test-cluster" section of the full name
   * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
   * </pre>
   *
   * <code>optional string cluster_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * The cluster to create.
   * The "name", "delete_time", and "current_operation" fields must be left
   * blank.
   * </pre>
   *
   * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
   */
  boolean hasCluster();
  /**
   * <pre>
   * The cluster to create.
   * The "name", "delete_time", and "current_operation" fields must be left
   * blank.
   * </pre>
   *
   * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
   */
  com.google.bigtable.admin.cluster.v1.Cluster getCluster();
  /**
   * <pre>
   * The cluster to create.
   * The "name", "delete_time", and "current_operation" fields must be left
   * blank.
   * </pre>
   *
   * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
   */
  com.google.bigtable.admin.cluster.v1.ClusterOrBuilder getClusterOrBuilder();
}