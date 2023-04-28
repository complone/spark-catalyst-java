package org.apache.spark.sql.catalyst.expressions.arithmetic;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

/**
 * Created by chengxy on 2023/03/23.
 */
public class UnaryMinus extends UnaryExpression {
    public UnaryMinus(Expression child){
        super(child);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof UnaryMinus){
            return super.equals(o);
        }
        return false;
    }
}
