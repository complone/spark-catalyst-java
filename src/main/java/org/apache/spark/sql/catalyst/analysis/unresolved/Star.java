package org.apache.spark.sql.catalyst.analysis.unresolved;

import org.apache.spark.sql.catalyst.expressions.LeafExpression;

public class Star extends LeafExpression {


    @Override
    public String toString(){
        return "*";
    }
}
