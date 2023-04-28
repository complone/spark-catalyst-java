package org.apache.spark.sql.catalyst.plans.logical;

/**
 * Created by chengxy on 2023/04/19.
 */
public abstract class OrderPreservingUnaryNode extends UnaryNode {

    public OrderPreservingUnaryNode(LogicalPlan child){
        super(child);
    }

}
