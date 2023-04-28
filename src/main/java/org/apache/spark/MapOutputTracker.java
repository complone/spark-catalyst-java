package org.apache.spark;

public abstract class MapOutputTracker {
    SparkConf conf;
    public MapOutputTracker(SparkConf conf){
        this.conf = conf;
    }

}
