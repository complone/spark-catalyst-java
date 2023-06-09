package org.apache.spark.sql.types;

import javafx.scene.chart.PieChart;
import lombok.Data;

/**
 * Created by chengxy on 2023/04/19.
 */
@Data
public class MapType extends DataType {
    DataType keyType;
    DataType valueType;
    boolean containsNull;

    public MapType(DataType keyType, DataType valueType, boolean containsNull){
        this.keyType = keyType;
        this.valueType = valueType;
        this.containsNull = containsNull;
    }

    public MapType(DataType keyType, DataType valueType){
        this(keyType, valueType, true);
    }

    @Override
    public boolean equals(Object o){
        boolean ok = super.equals(o);
        if(!ok){
            return false;
        }
        MapType m =(MapType)o;
        ok = equals(keyType,m.keyType);
        if(!ok){
            return false;
        }
        ok = equals(valueType,m.valueType);
        if(!ok){
            return false;
        }
        return containsNull==m.containsNull;
    }

}
