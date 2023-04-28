package org.apache.spark.sql.catalyst.expressions;

public abstract class BinaryOperator extends BinaryExpression {
    public BinaryOperator(Expression left, Expression right){
        super(left, right);
    }
}
