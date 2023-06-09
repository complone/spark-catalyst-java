package org.apache.spark.sql.catalyst.plans.logical.basicLogicalOperators;

import org.apache.spark.sql.catalyst.expressions.windowExpressions.WindowSpecDefinition;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;
import org.apache.spark.sql.catalyst.plans.logical.UnaryNode;

import java.util.Map;

public class WithWindowDefinition extends UnaryNode {
    Map<String ,WindowSpecDefinition>windowDefinitions;

    public WithWindowDefinition(Map<String ,WindowSpecDefinition>windowDefinitions, LogicalPlan child){
        super(child);
        this.windowDefinitions = windowDefinitions;
    }

}
