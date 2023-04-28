package org.apache.spark.sql.types;

import lombok.Data;

/**
 * Created by chengxy on 2023/04/23.
 */
@Data
public  abstract class UserDefinedType<UserType> extends DataType {
        DataType sqlType;
        public abstract Object serialize(UserType obj);
}
