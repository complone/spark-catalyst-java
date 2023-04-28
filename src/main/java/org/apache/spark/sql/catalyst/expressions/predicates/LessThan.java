package org.apache.spark.sql.catalyst.expressions.predicates;

import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/28.
 */
public class LessThan extends BinaryComparison {
    public LessThan(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof LessThan){
            return super.equals(o);
        }
        return false;
    }
}
