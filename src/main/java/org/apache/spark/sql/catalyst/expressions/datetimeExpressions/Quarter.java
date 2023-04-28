package org.apache.spark.sql.catalyst.expressions.datetimeExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

/**
 * Created by chengxy on 2023/03/28.
 */
public class Quarter extends UnaryExpression {
    public Quarter(Expression child){
        super(child);
    }
}
