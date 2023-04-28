package org.apache.spark.sql.catalyst.plans.logical.basicLogicalOperators;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;
import org.apache.spark.sql.catalyst.plans.logical.OrderPreservingUnaryNode;

/**
 * Created by chengxy on 2023/04/21.
 */
public class GlobalLimit extends OrderPreservingUnaryNode {
    Expression limitExpr;

    public GlobalLimit(Expression limitExpr,
            LogicalPlan child){
        super(child);
        this.limitExpr = limitExpr;
    }

}
