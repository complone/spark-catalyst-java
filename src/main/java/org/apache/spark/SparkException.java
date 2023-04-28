package org.apache.spark;

public class SparkException extends Exception {

    public SparkException(String message, Throwable cause){
        super(message,cause);
    }

    public SparkException(String message){
        super(message,null);
    }


}
