package org.apache.spark;

import java.io.Serializable;

public class SparkConf implements Serializable,Cloneable {
    boolean loadDefaults;

    public SparkConf(boolean loadDefaults){
        this.loadDefaults = loadDefaults;
    }

    public SparkConf(){
        this(true);
    }
}
