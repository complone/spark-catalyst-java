package org.apache.spark.sql.catalyst.expressions;

/**
 * Created by chengxy on 2023/04/27.
 */
public abstract class RuntimeReplaceable extends UnaryExpression {
    public RuntimeReplaceable(){
        super(null);
    }
}
