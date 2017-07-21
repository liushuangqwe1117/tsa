package com.tsa.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by LS on 2017-7-19.
 */
public class ConsoleAppenderTest {
    static Logger logger = LoggerFactory.getLogger(ConsoleAppenderTest.class.getName());
    static Logger speLogger = LoggerFactory.getLogger("sysLog");

    public static void main(String[] args) {

        logger.info("infoinfoinfoinfoinfoinfoinfo");
        logger.error("errorerrorerrorerrorerrorerr");

        speLogger.info("sysLog---infoinfoinfoinfoinfoinfoinfo");
        speLogger.error("sysLog---errorerrorerrorerrorerrorerr");

      /*  StringBuilder info = new StringBuilder();
        for(int i=0;i<1000;i++){
            info.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }
        for(int i=0;i<5000;i++){
            logger.info(info.toString());
        }*/

    }

}
