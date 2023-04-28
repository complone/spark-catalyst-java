package org.apache.spark.sql.catalyst.expressions.windowExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;

/**
 * Created by chengxy on 2023/03/28.
 */
public class UnresolvedWindowExpression extends UnaryExpression{
    WindowSpecReference windowSpec;

    public UnresolvedWindowExpression(Expression child,
                                      WindowSpecReference windowSpec){
        super(child);
        this.windowSpec = windowSpec;
    }
}
