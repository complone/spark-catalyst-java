package org.apache.spark.memory;

import org.apache.spark.SparkConf;

/**
 * Created by chengxy on 2023/03/18
 */
public abstract class MemoryManager {
    SparkConf conf;
    int numCores;
    long onHeapStorageMemory;
    long onHeapExecutionMemory;

    public MemoryManager(SparkConf conf,
            int numCores,
            long onHeapStorageMemory,
            long onHeapExecutionMemory){
        this.conf = conf;
        this.numCores = numCores;
                this.onHeapStorageMemory = onHeapStorageMemory;
                this.onHeapExecutionMemory = onHeapExecutionMemory;
    }

}
