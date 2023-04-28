package org.apache.spark.sql.catalyst.plans.joinTypes;

public class Inner extends InnerLike {

    public Inner(){
        this.explicitCartesian = false;
        this.sql = "INNER";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Inner){
            return super.equals(o);
        }
        return false;
    }


}
