package org.apache.spark.sql.internal;

import org.apache.spark.TaskContext;

public class ReadOnlySQLConf extends SQLConf  {
    TaskContext context;

    public ReadOnlySQLConf(TaskContext context){
        this.context = context;
    }

}
