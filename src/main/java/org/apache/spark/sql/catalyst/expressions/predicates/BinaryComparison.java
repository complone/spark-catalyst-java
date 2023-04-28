package org.apache.spark.sql.catalyst.expressions.predicates;

import org.apache.spark.sql.catalyst.expressions.BinaryOperator;
import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/26.
 */
public class BinaryComparison extends BinaryOperator {
    public BinaryComparison(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof BinaryComparison) {
            if (o == null) {
                return false;
            }
            if (o == this) {
                return true;
            }

            if (!(this.getClass() == o.getClass())) {
                return false;
            }
            return super.equals(o);
        }
        return false;
    }

}
