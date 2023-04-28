package org.apache.spark.util.clock;

/**
 * Created by chengxy on 2023/03/5.
 */
public interface Clock {
    long getTimeMillis();
    long waitTillTime(long targetTime);
}
