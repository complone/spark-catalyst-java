package org.apache.spark.sql.catalyst.plans.joinTypes;

/**
 * Created by chengxy on 2023/04/21.
 */
public class Cross extends InnerLike {

    public Cross(){
        this.explicitCartesian = true;
        this.sql = "CROSS";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Cross){
            return super.equals(o);
        }
        return false;
    }
}
