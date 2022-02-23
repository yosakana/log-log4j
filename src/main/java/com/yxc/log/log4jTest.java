package com.yxc.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;


public class log4jTest {

    @Test
    public void test1(){

        //开启日志详细信息
        LogLog.setInternalDebugging(true);


        //执行初始化配置
        //BasicConfigurator.configure();

        /*
            如果有log4j.properties文件，则会自动读取相关文件
         */
        //通过反射获取Logger
        Logger logger = Logger.getLogger(log4jTest.class);



        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        //默认输出级别debug
        logger.debug("debug");
        logger.info("info");
        logger.trace("trace");
    }
}
