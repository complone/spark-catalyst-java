package org.apache.spark.sql.catalyst.analysis.unresolved;

import org.apache.spark.sql.catalyst.parser.ParserUtils;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;
import org.apache.spark.sql.catalyst.plans.logical.UnaryNode;

import java.util.List;

/**
 * Created by chengxy on 2023/04/21.
 */
public class UnresolvedSubqueryColumnAliases extends UnaryNode {
    List<String > outputColumnNames;

    public UnresolvedSubqueryColumnAliases(List<String > outputColumnNames,
            LogicalPlan child){
        super(child);
        this.outputColumnNames = outputColumnNames;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof UnresolvedSubqueryColumnAliases){
            UnresolvedSubqueryColumnAliases u = (UnresolvedSubqueryColumnAliases)o;
            return ParserUtils.equalList(outputColumnNames,u.outputColumnNames);
        }
        return false;
    }
}
