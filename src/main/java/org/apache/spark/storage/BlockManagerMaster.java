package org.apache.spark.storage;

import org.apache.spark.SparkConf;
import org.apache.spark.rpc.RpcEndpointRef;

public class BlockManagerMaster {
    RpcEndpointRef driverEndpoint;
    SparkConf conf;
    boolean isDriver;
    public BlockManagerMaster(RpcEndpointRef driverEndpoint,
            SparkConf conf,
            boolean isDriver){
        this.driverEndpoint = driverEndpoint;
        this.conf = conf;
        this.isDriver = isDriver;
    }

}
