package org.apache.spark.sql.catalyst.expressions.datetimeExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

public class DayOfMonth  extends UnaryExpression {
    public DayOfMonth(Expression child){
        super(child);
    }
}