package org.apache.spark.sql.catalyst.parser;

import org.apache.spark.sql.internal.SQLConf;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by chengxy on 2023/04/28.
 */
@Service
public class CatalystSqlParser extends AbstractSqlParser {

    public CatalystSqlParser(SQLConf conf) {
        super(conf);
    }

    public CatalystSqlParser(){
        this(new SQLConf());
    }
}
