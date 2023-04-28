package org.apache.spark.sql.catalyst.expressions;

/**
 * Created by chengxy on 2023/03/21.
 */
public abstract class NullOrdering {
    String sql;
    public NullOrdering(String sql){
        this.sql = sql;
    }
}
