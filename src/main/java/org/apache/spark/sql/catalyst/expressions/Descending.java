package org.apache.spark.sql.catalyst.expressions;

public class Descending extends SortDirection{
    public Descending(){
        super("DESC", new NullsLast());
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Descending;
    }
}
