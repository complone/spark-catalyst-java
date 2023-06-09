package org.apache.spark.sql.catalyst.expressions.higherOrderFunctions;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.namedExpressions.NamedExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaFunction extends Expression{
    Expression function;
    List<NamedExpression> arguments;
    boolean hidden;
    public LambdaFunction(Expression function,
            List<NamedExpression> arguments,
            boolean hidden){
        this.function = function;
        this.arguments = arguments;
        this.hidden = hidden;
    }

    public LambdaFunction(Expression function,
                          List<NamedExpression> arguments){
        this(function,arguments,false);
    }

    @Override
    protected List<Expression> children(){
        List<Expression> list = Arrays.asList(function);
        list.addAll(arguments);
        return list;
    }
}
