package org.apache.spark.sql.catalyst.catalog;

import java.util.List;

/**
 * Created by chengxy on 2023/03/22.
 */
public class BucketSpec {
    int numBuckets;
    List<String>bucketColumnNames;
    List<String> sortColumnNames;
    public BucketSpec(int numBuckets,
            List<String>bucketColumnNames,
            List<String> sortColumnNames){
        this.numBuckets = numBuckets;
        this.bucketColumnNames = bucketColumnNames;
        this.sortColumnNames = sortColumnNames;
    }
}
