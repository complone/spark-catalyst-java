package org.apache.spark.sql.catalyst.plans.logical.statistics;

/**
 * Created by chengxy on 2023/03/1.
 */
public class Histogram {
    double height;
    HistogramBin[]bins;
    public Histogram(double height,
            HistogramBin[]bins){
        this.height= height;
        this.bins = bins;
    }
}
