package org.apache.spark.sql.catalyst.analysis;

public abstract class TypeCheckResult {
    public abstract boolean isSuccess();
    public boolean isFailure(){
        return !isSuccess();
    }

    public static class TypeCheckSuccess extends TypeCheckResult {
        @Override
        public boolean isSuccess(){
            return true;
        }
    }

    public static class TypeCheckFailure extends TypeCheckResult {
        String message;

        public TypeCheckFailure( String message){
            this.message = message;
        }

        @Override
        public boolean isSuccess(){
            return false;
        }
    }
}
