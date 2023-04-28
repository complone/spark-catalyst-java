package org.apache.spark.sql.catalyst.errors;

import org.apache.spark.sql.catalyst.trees.TreeNode;

/**
 * Created by chengxy on 2023/04/9.
 */
public class TreeNodeException extends Exception {

    transient TreeNode tree;
    String msg;
    Throwable cause;

    public TreeNodeException(TreeNode tree,
            String msg,
            Throwable cause){
        super(msg,cause);
        this.tree = tree;
    }
    public TreeNodeException(TreeNode tree,
                             String msg){
        this(tree,msg,null);
    }





}
