package org.apache.spark.sql.catalyst.catalog.functionResources;

public class DummyFunctionResourceLoader implements FunctionResourceLoader {
    @Override
    public void loadResource(FunctionResource resource){
        throw new UnsupportedOperationException();
    }
}
