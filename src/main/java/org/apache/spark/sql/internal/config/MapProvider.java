package org.apache.spark.sql.internal.config;

import java.util.Map;

public class MapProvider implements ConfigProvider {
    Map<String, String> conf;

    public MapProvider(Map<String, String> conf){
        this.conf = conf;
    }

    @Override
    public String get(String key){
        return conf.get(key);
    }
}
