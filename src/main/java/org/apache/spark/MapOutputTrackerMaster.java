package org.apache.spark;

import org.apache.spark.broadcast.BroadcastManager;

public class MapOutputTrackerMaster extends MapOutputTracker{
    SparkConf conf;
    BroadcastManager broadcastManager;
    boolean isLocal;
    public MapOutputTrackerMaster(SparkConf conf,
            BroadcastManager broadcastManager,
            boolean isLocal){
        super(conf);
        this.broadcastManager = broadcastManager;
        this.isLocal = isLocal;
    }
}
