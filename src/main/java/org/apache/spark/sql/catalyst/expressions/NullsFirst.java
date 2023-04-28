package org.apache.spark.sql.catalyst.expressions;

public class NullsFirst extends NullOrdering {
    public NullsFirst(){
        super("NULLS FIRST");
    }

    @Override
    public boolean equals(Object o){
        return o instanceof NullsFirst;
    }
}
