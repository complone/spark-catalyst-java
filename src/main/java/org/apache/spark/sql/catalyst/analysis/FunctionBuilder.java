package org.apache.spark.sql.catalyst.analysis;

import org.apache.spark.sql.catalyst.expressions.Expression;

import java.util.List;

/**
 * Created by chengxy on 2023/04/22.
 */
@FunctionalInterface
public interface FunctionBuilder {
    Expression apply (List<Expression> expressions);
}
