package org.apache.spark.sql.catalyst.util;

import java.io.Serializable;

/**
 * Created by chengxy on 2023/04/23.
 */
public abstract class MapData implements Serializable {
    public abstract int numElements();

    public abstract ArrayData keyArray();

    public abstract ArrayData valueArray();

    public abstract MapData copy();
}
