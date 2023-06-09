package org.apache.spark;

import java.io.Serializable;

public abstract class TaskContext implements Serializable{

    private static ThreadLocal<TaskContext> taskContext  = new ThreadLocal<>();

    public static TaskContext get(){
        return taskContext.get();
    }

}
