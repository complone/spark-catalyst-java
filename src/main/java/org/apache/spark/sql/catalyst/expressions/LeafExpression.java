package org.apache.spark.sql.catalyst.expressions;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafExpression extends Expression {
    @Override
    protected final List<Expression> children(){
        return new ArrayList<>();
    }
}
