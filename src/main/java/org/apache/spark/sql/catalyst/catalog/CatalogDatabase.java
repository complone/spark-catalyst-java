package org.apache.spark.sql.catalyst.catalog;

import lombok.Data;

import java.net.URI;
import java.util.Map;

/**
 * Created by chengxy on 2023/04/28.
 */
@Data
public class CatalogDatabase {
    String name;
    String description;
    URI locationUri;
    Map<String,String>properties;

    public CatalogDatabase(String name,
            String description,
            URI locationUri,
            Map<String,String>properties){
        this.name = name;
        this.description = description;
        this.locationUri = locationUri;
        this.properties = properties;
    }
}
