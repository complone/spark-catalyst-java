package org.apache.spark.sql.catalyst.expressions.windowExpressions;

/**
 * Created by chengxy on 2023/03/22.
 */
public class RangeFrame implements FrameType {
    @Override
    public boolean equals(Object o){
        if(o instanceof RangeFrame){
            return true;
        }
        return false;
    }
}
