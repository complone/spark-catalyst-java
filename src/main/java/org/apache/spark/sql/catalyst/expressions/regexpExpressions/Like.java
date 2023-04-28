package org.apache.spark.sql.catalyst.expressions.regexpExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/28.
 */
public class Like extends StringRegexExpression{
    public Like(Expression left, Expression right){
        super(left, right);
    }
}
