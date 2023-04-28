package org.apache.spark.sql.catalyst.analysis.AlreadyExistException;

import org.apache.spark.sql.AnalysisException;

/**
 * Created by chengxy on 2023/03/1.
 */
public class DatabaseAlreadyExistsException extends AnalysisException{
    public DatabaseAlreadyExistsException(String db){
        super("Database '$db' already exists");
    }

}
