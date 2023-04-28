package org.apache.spark.sql.catalyst.expressions;

import lombok.Data;

@Data
public abstract class SortDirection {
    String sql;
    NullOrdering defaultNullOrdering;
    public SortDirection(String sql,NullOrdering defaultNullOrdering){
        this.sql = sql;
        this.defaultNullOrdering = defaultNullOrdering;
    }
}
