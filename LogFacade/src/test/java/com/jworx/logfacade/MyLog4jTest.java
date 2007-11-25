package com.jworx.logfacade;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLog4jTest {
    static Log log = LogFactory.getLog(MyLog4jTest.class);

    @Test
    public void tryDebugLog() {
        assertTrue(true);
        log.debug("Simple log");

        log.debug("Simple log again");

        log.debug("And again%s", "...");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            log.trace("Formatted %s: count %d", "log", i);
        }

        System.out.println("Time1: " + (System.currentTimeMillis() - start));


    }
}
