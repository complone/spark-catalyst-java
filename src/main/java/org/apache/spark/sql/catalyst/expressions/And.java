package org.apache.spark.sql.catalyst.expressions;

public class And extends BinaryOperator {
    public And(Expression left, Expression right){
        super(left, right);
    }

}
