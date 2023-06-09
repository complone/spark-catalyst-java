package org.apache.spark.sql.catalyst.plans.logical.basicLogicalOperators;

import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;

public class Intersect extends SetOperation{
    boolean isAll;
    public Intersect(LogicalPlan left, LogicalPlan right, boolean isAll){
        super(left, right);
        this.isAll = isAll;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Intersect){
            return super.equals(o);
        }
        return false;
    }
}
