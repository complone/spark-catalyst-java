package org.apache.spark.scheduler;

import org.apache.spark.SparkConf;

public class OutputCommitCoordinator {
    SparkConf conf;
    boolean isDriver;
    public OutputCommitCoordinator(SparkConf conf,
            boolean isDriver){
        this.conf = conf;
        this.isDriver = isDriver;
    }
}
