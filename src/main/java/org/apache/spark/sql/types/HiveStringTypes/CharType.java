package org.apache.spark.sql.types.HiveStringTypes;

/**
 * Created by chengxy on 2023/04/26.
 */
public class CharType extends HiveStringType {
    int length;
    public CharType(int length){
        this.length = length;
    }
}
