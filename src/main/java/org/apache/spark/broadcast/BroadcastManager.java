package org.apache.spark.broadcast;

import org.apache.spark.SecurityManager;
import org.apache.spark.SparkConf;

public class BroadcastManager {
    boolean isDriver;
    SparkConf conf;
    SecurityManager securityManager;

    public BroadcastManager(boolean isDriver,
            SparkConf conf,
            SecurityManager securityManager){
        this.isDriver = isDriver;
        this.conf = conf;
        this.securityManager = securityManager;
    }
}
