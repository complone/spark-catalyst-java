package org.apache.spark.sql.catalyst.expressions.aggregate;

import org.apache.spark.sql.catalyst.expressions.Expression;

/**
 * Created by chengxy on 2023/03/18.
 */
public abstract class AggregateFunction extends Expression {
    public AggregateExpression toAggregateExpression(){
        return toAggregateExpression(false);
    }

    public AggregateExpression toAggregateExpression(boolean isDistinct){
        return new AggregateExpression(this, new Complete(),isDistinct);
    }
}
