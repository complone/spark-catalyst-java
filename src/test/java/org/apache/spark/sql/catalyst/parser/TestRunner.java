package org.apache.spark.sql.catalyst.parser;
import org.apache.commons.lang3.StringUtils;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * Created by chengxy on 2023/03/4.
 */
public class TestRunner {
    public static void main(String[] args) {

        String s = StringUtils.left("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",120);
        System.out.println(s);
        System.out.println(s.length());
//        Result result = JUnitCore.runClasses(ParserTest.class);
//
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//
//        System.out.println(result.wasSuccessful());
    }
}
