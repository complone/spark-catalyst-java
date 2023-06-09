package org.apache.spark.sql.catalyst.plans.joinTypes;

import org.apache.spark.sql.catalyst.parser.ParserUtils;

/**
 * Created by chengxy on 2023/04/21.
 */
public class RightOuter extends JoinType{
    public RightOuter(){
        this.sql = "RIGHT OUTER";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof RightOuter){
            return super.equals(o);
        }
        return false;
    }
}
