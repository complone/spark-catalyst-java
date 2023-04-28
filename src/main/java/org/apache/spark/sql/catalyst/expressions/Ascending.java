package org.apache.spark.sql.catalyst.expressions;

public class Ascending extends SortDirection {
    public Ascending(){
        super("ASC", new NullsFirst());
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Ascending;
    }
}
