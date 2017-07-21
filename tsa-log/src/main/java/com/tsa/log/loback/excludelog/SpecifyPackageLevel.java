package com.tsa.log.loback.excludelog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by LS on 2017-7-21.
 */
public class SpecifyPackageLevel {
    static Logger logger = LoggerFactory.getLogger(SpecifyPackageLevel.class.getName());

    public static void main(String[] args) {
        logger.info("SpecifyPackageLevel.======info======");
        logger.error("SpecifyPackageLevel.======error======");
    }
}
