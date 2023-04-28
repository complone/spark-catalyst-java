package org.apache.spark.sql.catalyst.analysis.unresolved;

import org.apache.spark.sql.catalyst.expressions.BinaryExpression;
import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/28.
 */
public class UnresolvedExtractValue extends BinaryExpression{
    public UnresolvedExtractValue(Expression child, Expression extraction){
        super(child, extraction);
    }
}
