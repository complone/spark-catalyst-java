package org.apache.spark;

import org.apache.spark.sql.internal.config.ConfigEntry;
import static org.apache.spark.sql.internal.config.config.*;

public class SecurityManager {
    SparkConf sparkConf;
    Byte[] ioEncryptionKey;
    ConfigEntry<String> authSecretFileConf;

    public SecurityManager(SparkConf sparkConf,
            Byte[] ioEncryptionKey,
            ConfigEntry<String> authSecretFileConf){
        this.sparkConf = sparkConf;
        this.ioEncryptionKey = ioEncryptionKey;
        this.authSecretFileConf = authSecretFileConf;
    }
    public SecurityManager(SparkConf sparkConf){
        this(sparkConf,null,AUTH_SECRET_FILE);
    }
}
