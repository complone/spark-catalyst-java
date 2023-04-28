package org.apache.spark.sql.catalyst.expressions.bitwiseExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.arithmetic.BinaryArithmetic;

/**
 * Created by chengxy on 2023/03/23.
 */
public class BitwiseAnd extends BinaryArithmetic {
    public BitwiseAnd(Expression left, Expression right){
        super(left, right);
    }
}
