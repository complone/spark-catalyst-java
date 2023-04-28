package org.apache.spark.scheduler;

import org.apache.spark.SparkConf;

public class LiveListenerBus {
    SparkConf conf;
    public LiveListenerBus(SparkConf conf){
        this.conf = conf;
    }
}
