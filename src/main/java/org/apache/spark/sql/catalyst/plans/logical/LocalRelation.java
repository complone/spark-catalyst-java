package org.apache.spark.sql.catalyst.plans.logical;

import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.catalyst.expressions.Attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by chengxy on 2023/04/26.
 * first Class outside parser
 */
public class LocalRelation extends LeafNode {
    List<Attribute> output;
    List<InternalRow> data;
    boolean isStreaming;

    public LocalRelation(List<Attribute> output,
            List<InternalRow> data,
            boolean isStreaming){
        this.output = output;
        this.data = data;
        this.isStreaming = isStreaming;
    }

    public LocalRelation(Attribute...output){
        this(Arrays.asList(output), new ArrayList<>(), false);
    }

}
