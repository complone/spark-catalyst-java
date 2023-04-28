package org.apache.spark.sql.catalyst.expressions.grouping;

import org.apache.spark.sql.catalyst.expressions.Expression;

import java.util.List;

/**
 * Created by chengxy on 2023/03/26.
 */
public abstract class GroupingSet extends Expression {

    abstract List<Expression>groupByExprs();

    @Override
    protected List<Expression> children(){
        return groupByExprs();
    }
}
