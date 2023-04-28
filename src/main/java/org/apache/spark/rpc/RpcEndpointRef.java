package org.apache.spark.rpc;

import org.apache.spark.SparkConf;

public abstract class RpcEndpointRef {
    SparkConf conf;
    public RpcEndpointRef(SparkConf conf){
        this.conf = conf;
    }
}
