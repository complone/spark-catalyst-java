package org.apache.spark.rpc;

import org.apache.spark.SparkConf;

public abstract class RpcEnv {
    SparkConf conf;
    public RpcEnv(SparkConf conf){
        this.conf = conf;
    }
}
