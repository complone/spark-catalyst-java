package org.apache.spark.sql.catalyst.expressions.arithmetic;

import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/18.
 */
public class Add extends BinaryArithmetic {
    public Add(Expression left, Expression right){
        super(left, right);
    }
}
