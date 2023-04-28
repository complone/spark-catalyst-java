package org.apache.spark.sql.types;

/**
 * Created by chengxy on 2023/04/22.
 */
public class IntegerType extends DataType {
    @Override
    public boolean equals(Object o){
        return o instanceof  IntegerType;
    }
}
