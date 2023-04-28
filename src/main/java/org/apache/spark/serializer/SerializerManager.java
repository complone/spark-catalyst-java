package org.apache.spark.serializer;

import org.apache.spark.SparkConf;

/**
 * Created by chengxy on 2023/03/14.
 */
public class SerializerManager {
    Serializer defaultSerializer;
    SparkConf conf;
    Byte[] encryptionKey;

    public SerializerManager(Serializer defaultSerializer,
            SparkConf conf,
            Byte[] encryptionKey){
        this.defaultSerializer = defaultSerializer;
        this.conf = conf;
        this.encryptionKey=encryptionKey;
    }
}
