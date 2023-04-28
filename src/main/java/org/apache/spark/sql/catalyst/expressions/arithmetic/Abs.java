package org.apache.spark.sql.catalyst.expressions.arithmetic;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

/**
 * Created by chengxy on 2023/03/18.
 */
public class Abs extends UnaryExpression {
    public Abs(Expression child){
        super(child);
    }
}
