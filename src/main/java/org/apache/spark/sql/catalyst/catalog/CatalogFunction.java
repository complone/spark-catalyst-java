package org.apache.spark.sql.catalyst.catalog;

import org.apache.spark.sql.catalyst.catalog.functionResources.FunctionResource;
import org.apache.spark.sql.catalyst.identifiers.FunctionIdentifier;

import java.util.List;

/**
 * Created by chengxy on 2023/03/21.
 */
public class CatalogFunction {
    FunctionIdentifier identifier;
    String className;
    List<FunctionResource> resources;

    public CatalogFunction(FunctionIdentifier identifier,
            String className,
            List<FunctionResource> resources){
        this.identifier=identifier;
        this.className = className;
        this.resources=resources;
    }

}
