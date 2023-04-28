package org.apache.spark.sql.catalyst.expressions.predicates;

import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/26.
 */
public class GreaterThan extends BinaryComparison {
    public GreaterThan(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof GreaterThan){
            return super.equals(o);
        }
        return false;
    }
}
