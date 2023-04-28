package org.apache.spark.sql.catalyst.expressions.nullExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

/**
 * Created by chengxy on 2023/03/26.
 */
public class IsNotNull extends UnaryExpression {
    public IsNotNull(Expression child){
        super(child);
    }
}
