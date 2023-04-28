package org.apache.spark.sql.catalyst.plans.logical;

import org.apache.spark.sql.catalyst.plans.QueryPlan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

/**
 * Created by chengxy on 2023/04/28.
 */
@Service
public abstract class AnalysisHelper extends QueryPlan<LogicalPlan>{



//    @Override
//    public LogicalPlan transformUp(Function<LogicalPlan, LogicalPlan>rule){
//        //assertNotAnalysisRule()
//        return super.transformUp(rule);
//    }

}
