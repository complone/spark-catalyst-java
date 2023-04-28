package org.apache.spark.sql.catalyst.expressions.windowExpressions;

import org.apache.spark.sql.catalyst.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengxy on 2023/03/28.
 */
public abstract class SpecialFrameBoundary extends Expression {
    @Override
    protected List<Expression>children(){
        return new ArrayList<>();
    }
}
