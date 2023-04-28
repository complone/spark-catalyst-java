package org.apache.spark.sql.catalyst.identifiers;

public class TableIdentifier extends IdentifierWithDatabase {

    public TableIdentifier(String table){
        super(table);
    }

    public TableIdentifier(String table, String database){
        super(table, database);
    }


    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof TableIdentifier){
            return super.equals(o);
        }
        return false;
    }

}
