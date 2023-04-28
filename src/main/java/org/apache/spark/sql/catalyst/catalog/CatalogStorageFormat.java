package org.apache.spark.sql.catalyst.catalog;

import java.net.URI;
import java.util.Map;

/**
 * Created by chengxy on 2023/04/21.
 */
public class CatalogStorageFormat {
    URI locationUri;
    String inputFormat;
    String outputFormat;
    String serde;
    boolean compressed;
    Map<String,String> properties;

    public CatalogStorageFormat(URI locationUri,
            String inputFormat,
            String outputFormat,
            String serde,
            boolean compressed,
            Map<String,String> properties){
        this.locationUri = locationUri;
        this.inputFormat = inputFormat;
        this.outputFormat = outputFormat;
        this.serde = serde;
        this.compressed = compressed;
        this.properties = properties;
    }

}
