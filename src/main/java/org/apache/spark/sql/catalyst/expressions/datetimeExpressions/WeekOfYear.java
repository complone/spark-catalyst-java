package org.apache.spark.sql.catalyst.expressions.datetimeExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

/**
 * Created by chengxy on 2023/03/28.
 */
public class WeekOfYear extends UnaryExpression {
    public WeekOfYear(Expression child){
        super(child);
    }
}