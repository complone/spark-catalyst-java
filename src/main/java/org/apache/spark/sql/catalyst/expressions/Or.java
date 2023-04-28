package org.apache.spark.sql.catalyst.expressions;

public class Or extends BinaryOperator {

    public Or(Expression left, Expression right){
        super(left, right);
    }

}

