package org.apache.spark.sql.catalyst.plans.logical.basicLogicalOperators;

import org.apache.spark.sql.catalyst.plans.logical.BinaryNode;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;

/**
 * Created by chengxy on 2023/04/21.
 */
public class SetOperation extends BinaryNode {
    public SetOperation(LogicalPlan left, LogicalPlan right){
        super(left, right);
    }
}
