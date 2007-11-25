package com.jworx.logfacade;

import org.junit.Test;

public class PerformanceTest {
    static Log log = LogFactory.getLog(PerformanceTest.class);

    @Test
    public void tryDebugLog() {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            log.trace("Formatted %s: count %d", "log", i);
        }
        System.out.println("Time1: " + (System.currentTimeMillis() - start));

    }
}
