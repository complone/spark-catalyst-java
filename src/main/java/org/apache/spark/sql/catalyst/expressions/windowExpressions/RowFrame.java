package org.apache.spark.sql.catalyst.expressions.windowExpressions;

import lombok.Data;

/**
 * Created by chengxy on 2023/03/28.
 */
public class RowFrame implements FrameType {
    @Override
    public boolean equals(Object o){
        if(o instanceof RowFrame){
            return true;
        }
        return false;
    }
}
