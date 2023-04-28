package org.apache.spark.sql.catalyst.expressions.higherOrderFunctions;

import org.apache.spark.sql.catalyst.expressions.LeafExpression;
import org.apache.spark.sql.catalyst.expressions.namedExpressions.NamedExpression;

import java.util.List;

public class UnresolvedNamedLambdaVariable extends NamedExpression {
    List<String> nameParts;
    public UnresolvedNamedLambdaVariable(List<String> nameParts){
        this.nameParts = nameParts;
    }
}
