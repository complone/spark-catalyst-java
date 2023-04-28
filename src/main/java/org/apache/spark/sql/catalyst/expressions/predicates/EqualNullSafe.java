package org.apache.spark.sql.catalyst.expressions.predicates;

import org.apache.spark.sql.catalyst.expressions.Expression;

import java.util.List;

/**
 * Created by chengxy on 2023/03/28.
 */
public class EqualNullSafe extends BinaryComparison {
    public EqualNullSafe(Expression left, Expression right){
        super(left, right);
    }

    public EqualNullSafe(List<Expression> expressions){
        super(expressions.get(0),expressions.get(1));
    }


    @Override
    public boolean equals(Object o){
        if(o instanceof EqualNullSafe){
            return super.equals(o);
        }
        return false;
    }
}
