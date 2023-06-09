package org.apache.spark.sql.types;

import lombok.Data;
import org.apache.spark.sql.catalyst.expressions.AttributeReference;
import org.apache.spark.sql.catalyst.parser.CatalystSqlParser;
import org.apache.spark.sql.catalyst.parser.ParserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by chengxy on 2023/04/19.
 */
@Data
public class StructType extends DataType {

    List<StructField> fields;

    public StructType(List<StructField> fields){
        this.fields = fields;
    }

    public StructType(StructField...fields){
        this(Arrays.asList(fields));
    }

    public StructType(){
        this(new ArrayList<>());
    }

    public List<AttributeReference> toAttributes(){
        List<AttributeReference> references = new ArrayList<>();
        for(StructField f: fields){
            references.add(new AttributeReference(f.name, f.dataType, f.nullable, f.metadata));
        }
        return references;
    }

    public StructType add(String name, DataType dataType){
        fields.add(new StructField(name, dataType, true, Metadata.empty()));
        return new StructType(fields);
    }

    public StructType add(String name, String dataType){
        CatalystSqlParser catalystSqlParser = new CatalystSqlParser();
        return add(name, catalystSqlParser.parseDataType(dataType), true, Metadata.empty());
    }

    public StructType add(
            String name,
            DataType dataType,
            boolean nullable,
            Metadata metadata){
        List<StructField> f = new ArrayList<>();
        f.addAll(fields);
        f.add(new StructField(name, dataType, nullable, metadata));
        return new StructType(f);
    }

    public StructType add(
            String name,
            String dataType,
            boolean nullable,
            String comment){
        CatalystSqlParser catalystSqlParser = new CatalystSqlParser();
        return add(name, catalystSqlParser.parseDataType(dataType), nullable, comment);
    }

    public StructType add(
            String name,
            DataType dataType,
            boolean nullable,
            String comment){
        fields.add(new StructField(name, dataType, nullable).withComment(comment));
        return new StructType(fields);
    }

    @Override
    public boolean equals(Object o){
        boolean ok = super.equals(o);
        if(!ok){
            return false;
        }
        StructType s =(StructType)o;
        if((fields==null || fields.size()==0) && (s.fields==null && s.fields.size()==0)){
            return true;
        }

        if(!ParserUtils.equalList(s.fields,fields)){
            return false;
        }

        if(fields!=null) {

            for (int i = 0; i < fields.size(); i++) {
                ok = equals(fields.get(i), s.fields.get(i));
                if (!ok) {
                    return false;
                }
            }
        }
        return true;


    }

}
