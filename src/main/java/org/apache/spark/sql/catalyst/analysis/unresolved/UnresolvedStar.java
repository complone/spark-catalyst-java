package org.apache.spark.sql.catalyst.analysis.unresolved;

import lombok.Data;

import java.util.List;

/**
 * Created by chengxy on 2023/04/21.
 */
@Data
public class UnresolvedStar  extends Star{
    List<String> target;
    public UnresolvedStar( List<String> target){
        this.target = target;
    }
    public UnresolvedStar( ){
        this(null);
    }

}
