package org.apache.spark.sql.catalyst.expressions.subquery;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.plans.QueryPlan;

/**
 * Created by chengxy on 2023/03/28.
 */
public abstract class PlanExpression <T extends QueryPlan> extends Expression{
     T plan ;
}
