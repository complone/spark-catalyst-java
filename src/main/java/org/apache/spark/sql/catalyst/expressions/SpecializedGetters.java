package org.apache.spark.sql.catalyst.expressions;

import org.apache.spark.sql.types.DataType;

/**
 * Created by chengxy on 2023/04/23.
 */
public interface SpecializedGetters {
    Object get(int ordinal, DataType dataType);
}
