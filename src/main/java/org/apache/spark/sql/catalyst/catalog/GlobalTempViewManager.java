package org.apache.spark.sql.catalyst.catalog;

import lombok.Data;

/**
 * Created by chengxy on 2023/04/26.
 */
@Data
public class GlobalTempViewManager {
    String database;
    public GlobalTempViewManager(String database){
        this.database = database;
    }
}
