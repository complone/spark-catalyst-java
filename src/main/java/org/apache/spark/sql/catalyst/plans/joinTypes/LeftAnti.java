package org.apache.spark.sql.catalyst.plans.joinTypes;

/**
 * Created by chengxy on 2023/04/21.
 */
public class LeftAnti extends JoinType {

    public LeftAnti(){
        this.sql = "LEFT ANTI";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof LeftAnti){
            return super.equals(o);
        }
        return false;
    }

}
