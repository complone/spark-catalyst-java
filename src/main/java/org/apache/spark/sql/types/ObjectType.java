package org.apache.spark.sql.types;

import lombok.Data;

@Data
public class ObjectType extends DataType {
    Class cls;

    public ObjectType(Class cls){
        this.cls = cls;
    }

}
