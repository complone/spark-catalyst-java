package org.apache.spark.sql.catalyst.catalog.functionResources;

public interface FunctionResourceLoader {
    void loadResource(FunctionResource resource);
}
