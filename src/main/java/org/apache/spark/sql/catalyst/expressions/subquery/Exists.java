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
public class Exists extends SubqueryExpression {
    LogicalPlan plan;
    List<Expression> children;
    ExprId exprId;
    public Exists(LogicalPlan plan,
            List<Expression> children,
            ExprId exprId){
        super(plan, children, exprId);
    }
    public Exists(LogicalPlan plan,
                  ExprId exprId){
        super(plan, new ArrayList<>(), exprId);
    }
    public Exists(LogicalPlan plan){
        this(plan,NamedExpression.newExprId());
    }

    @Override
    public Exists clone(){
        return new Exists(plan,children,exprId);
    }
}
