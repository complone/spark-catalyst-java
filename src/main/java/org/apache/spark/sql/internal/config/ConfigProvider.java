package org.apache.spark.sql.internal.config;

public interface ConfigProvider {
    String get(String key);
}
