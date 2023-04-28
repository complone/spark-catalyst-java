package org.apache.spark.sql.catalyst.analysis;

import org.apache.spark.sql.AnalysisException;

public class TempTableAlreadyExistsException extends AnalysisException{
    String table;
    public TempTableAlreadyExistsException(String table){
        super("Temporary view '$table' already exists");
        this.table = table;
    }

}
