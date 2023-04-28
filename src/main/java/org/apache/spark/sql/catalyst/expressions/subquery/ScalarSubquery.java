package org.apache.spark.sql.catalyst.expressions.subquery;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.namedExpressions.ExprId;
import org.apache.spark.sql.catalyst.expressions.namedExpressions.NamedExpression;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengxy on 2023/03/28.
 */
public class ScalarSubquery extends SubqueryExpression {
    public ScalarSubquery(
            LogicalPlan plan,
            List<Expression> children,
            ExprId exprId){
        super(plan, children, exprId);
    }
    public ScalarSubquery(LogicalPlan plan){
                this(plan, new ArrayList<>(), NamedExpression.newExprId());
    }


    @Override
    public ScalarSubquery clone(){
        return new ScalarSubquery(getPlan(),getChildren(),getExprId());
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof ScalarSubquery){
            return super.equals(o);
        }
        return false;
    }
}
