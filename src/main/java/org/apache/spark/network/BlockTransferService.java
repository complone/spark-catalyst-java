package org.apache.spark.network;

import org.apache.spark.network.shuffle.ShuffleClient;

import java.io.Closeable;

/**
 * Created by chengxy on 2023/03/04.
 */
public abstract class BlockTransferService extends ShuffleClient implements Closeable{

}
