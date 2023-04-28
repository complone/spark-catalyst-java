package org.apache.spark.sql.catalyst.expressions.windowExpressions;

/**
 * Created by chengxy on 2023/03/28.
 */
public class CurrentRow extends SpecialFrameBoundary {
    @Override
    public boolean equals(Object o){
        if(o instanceof CurrentRow){
            return true;
        }
        return false;
    }
}
