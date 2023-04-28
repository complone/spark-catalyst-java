package org.apache.spark.sql.catalyst.plans.joinTypes;

/**
 * Created by chengxy on 2023/04/21.
 */
public class LeftSemi extends JoinType {
    public LeftSemi(){
        this.sql = "LEFT SEMI";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof LeftSemi){
            return super.equals(o);
        }
        return false;
    }

}
