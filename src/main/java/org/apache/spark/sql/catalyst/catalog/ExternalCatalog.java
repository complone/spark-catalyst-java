package org.apache.spark.sql.catalyst.catalog;

/**
 * Created by chengxy on 2023/03/21.
 */
public interface ExternalCatalog {
    void createDatabase(CatalogDatabase dbDefinition, boolean ignoreIfExists);
}
