package org.apache.spark.sql.catalyst.expressions.windowExpressions;

import lombok.Data;

/**
 * Created by chengxy on 2023/04/18.
 */
@Data
public class WindowSpecReference implements  WindowSpec{
    String name;

    public WindowSpecReference(String name){
        this.name = name;
    }
}
