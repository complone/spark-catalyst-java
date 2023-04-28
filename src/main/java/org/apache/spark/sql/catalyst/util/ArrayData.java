package org.apache.spark.sql.catalyst.util;

import org.apache.spark.sql.catalyst.expressions.SpecializedGetters;

import java.io.Serializable;

/**
 * Created by chengxy on 2023/04/23.
 */
public abstract class ArrayData implements SpecializedGetters, Serializable {
    public abstract int numElements();
}
