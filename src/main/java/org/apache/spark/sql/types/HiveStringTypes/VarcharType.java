package org.apache.spark.sql.types.HiveStringTypes;

/**
 * Created by chengxy on 2023/04/26.
 */
public class VarcharType  extends HiveStringType {
    int length;
    public VarcharType(int length){
        this.length = length;
    }
}