package org.apache.spark.sql.catalyst.analysis.unresolved;

/**
 * Created by chengxy on 2023/03/10.
 */
public class UnresolvedRegex extends Star {
    String regexPattern;
    String table;
    boolean caseSensitive;
    public UnresolvedRegex(String regexPattern,
            String table,
            boolean caseSensitive){
        this.regexPattern = regexPattern;
        this.table = table;
        this.caseSensitive = caseSensitive;
    }
}
