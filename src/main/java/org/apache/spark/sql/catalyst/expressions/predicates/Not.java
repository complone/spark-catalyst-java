package org.apache.spark.sql.catalyst.expressions.predicates;

import org.apache.spark.sql.catalyst.expressions.Expression;
import org.apache.spark.sql.catalyst.expressions.UnaryExpression;
import org.apache.spark.sql.catalyst.parser.ParserUtils;

/**
 * Created by chengxy on 2023/03/28.
 */
public class Not extends UnaryExpression{
    public Not(Expression child){
        super(child);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Not){
            return super.equals(o);
        }
        return false;
    }
}
