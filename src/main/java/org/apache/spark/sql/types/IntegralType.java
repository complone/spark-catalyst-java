package org.apache.spark.sql.types;

/**
 * Created by chengxy on 2023/04/22.
 */
public class IntegralType extends NumericType {
    @Override
    public boolean equals(Object o){
        return o instanceof  IntegralType;
    }
}
