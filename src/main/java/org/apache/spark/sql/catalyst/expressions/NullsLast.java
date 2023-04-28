package org.apache.spark.sql.catalyst.expressions;

/**
 * Created by chengxy on 2023/04/21.
 */
public class NullsLast extends NullOrdering {
    public NullsLast(){
        super("NULLS LAST");
    }
    @Override
    public boolean equals(Object o){
        return o instanceof NullsLast;
    }
}
