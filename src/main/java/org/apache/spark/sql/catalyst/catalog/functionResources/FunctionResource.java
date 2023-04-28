package org.apache.spark.sql.catalyst.catalog.functionResources;

public class FunctionResource {
    FunctionResourceType resourceType;
    String uri;

    public FunctionResource( FunctionResourceType resourceType,
            String uri){
        this.resourceType = resourceType;
        this.uri = uri;
    }
}
