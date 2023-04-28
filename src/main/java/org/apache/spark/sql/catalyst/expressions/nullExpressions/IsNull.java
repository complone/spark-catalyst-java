package org.apache.spark.sql.catalyst.expressions.nullExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

/**
 * Created by chengxy on 2023/03/26.
 */
public class IsNull extends UnaryExpression {
    public IsNull(Expression child){
        super(child);
    }
}
