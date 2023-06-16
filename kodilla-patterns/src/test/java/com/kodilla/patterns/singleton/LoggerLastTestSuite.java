package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerLastTestSuite {
    @Test
    void TestLog() {
        Logger logger = Logger.INSTANCE;
        logger.getLastLog();
        Assertions.assertEquals("Adam Małysz", logger.getLastLog());
        System.out.println(logger.getLastLog() + " =Adagim Małysz");
    }
}
