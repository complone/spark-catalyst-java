package org.apache.spark.metrics;

import org.apache.spark.SecurityManager;
import org.apache.spark.SparkConf;

/**
 * Created by chengxy on 2023/03/15.
 */
public class MetricsSystem {
    String instance;
    SparkConf conf;
    SecurityManager securityMgr;
    public MetricsSystem(String instance,
            SparkConf conf,
            SecurityManager securityMgr){
        this.instance = instance;
        this.conf = conf;
        this.securityMgr =securityMgr;
    }
}
