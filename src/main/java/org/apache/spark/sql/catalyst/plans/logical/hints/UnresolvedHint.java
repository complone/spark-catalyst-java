package org.apache.spark.sql.catalyst.plans.logical.hints;

import org.apache.commons.lang3.StringUtils;
import org.apache.spark.sql.catalyst.parser.ParserUtils;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;
import org.apache.spark.sql.catalyst.plans.logical.UnaryNode;

import java.util.List;

/**
 * Created by chengxy on 2023/04/20.
 */
public class UnresolvedHint extends UnaryNode {
    String name;
    List<Object>  parameters;

    public UnresolvedHint(String name,
            List<Object>  parameters,
            LogicalPlan child){
        super(child);
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o){
        if( o instanceof UnresolvedHint){
            UnresolvedHint u = (UnresolvedHint)o;
            return StringUtils.equals(name,u.name) && ParserUtils.equalList(parameters,u.parameters);
        }
        return false;
    }

}
