package org.apache.spark.sql.catalyst.expressions.arithmetic;

import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/23.
 */
public class Remainder extends DivModLike {
    public Remainder(Expression left, Expression right) {
        super(left, right);
    }
}
