package org.apache.spark.sql.catalyst.analysis;

import org.apache.spark.sql.catalyst.expressions.ExpressionInfo;
import org.apache.spark.sql.catalyst.identifiers.FunctionIdentifier;

/**
 * Created by chengxy on 2023/03/7.
 */
public class EmptyFunctionRegistry extends FunctionRegistry {

    @Override
    public void registerFunction(
            FunctionIdentifier name , ExpressionInfo info , FunctionBuilder builder){
        throw new UnsupportedOperationException();
    }

}
