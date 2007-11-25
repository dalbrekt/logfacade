package com.jworx.logfacade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.junit.Test;

public class LogLevelTest {

    @Test
    public void verifyIsLevelEnabled() {
        Log log = LogFactory.getLog(LogLevelTest.class);
        org.apache.log4j.Logger logger = LogManager.getLoggerRepository().getLogger(
                LogLevelTest.class.getName());

        String failInfo;
        
        logger.setLevel(Level.ALL);
        failInfo = "Log level is " + logger.getLevel();
        assertTrue(failInfo, log.isTraceEnabled());
        assertTrue(failInfo, log.isDebugEnabled());
        assertTrue(failInfo, log.isInfoEnabled());
        assertTrue(failInfo, log.isWarnEnabled());
        assertTrue(failInfo, log.isErrorEnabled());
        assertTrue(failInfo, log.isFatalEnabled());
        
        logger.setLevel(Level.TRACE);
        failInfo = "Log level is " + logger.getLevel();
        assertTrue(failInfo, log.isTraceEnabled());
        assertTrue(failInfo, log.isDebugEnabled());
        assertTrue(failInfo, log.isInfoEnabled());
        assertTrue(failInfo, log.isWarnEnabled());
        assertTrue(failInfo, log.isErrorEnabled());
        assertTrue(failInfo, log.isFatalEnabled());
        
        logger.setLevel(Level.DEBUG);
        failInfo = "Log level is " + logger.getLevel();
        assertFalse(failInfo, log.isTraceEnabled());
        assertTrue(failInfo, log.isDebugEnabled());
        assertTrue(failInfo, log.isInfoEnabled());
        assertTrue(failInfo, log.isWarnEnabled());
        assertTrue(failInfo, log.isErrorEnabled());
        assertTrue(failInfo, log.isFatalEnabled());

        logger.setLevel(Level.INFO);
        failInfo = "Log level is " + logger.getLevel();
        assertFalse(failInfo, log.isTraceEnabled());
        assertFalse(failInfo, log.isDebugEnabled());
        assertTrue(failInfo, log.isInfoEnabled());
        assertTrue(failInfo, log.isWarnEnabled());
        assertTrue(failInfo, log.isErrorEnabled());
        assertTrue(failInfo, log.isFatalEnabled());
        
        logger.setLevel(Level.WARN);
        failInfo = "Log level is " + logger.getLevel();
        assertFalse(failInfo, log.isTraceEnabled());
        assertFalse(failInfo, log.isDebugEnabled());
        assertFalse(failInfo, log.isInfoEnabled());
        assertTrue(failInfo, log.isWarnEnabled());
        assertTrue(failInfo, log.isErrorEnabled());
        assertTrue(failInfo, log.isFatalEnabled());
        
        logger.setLevel(Level.ERROR);
        failInfo = "Log level is " + logger.getLevel();
        assertFalse(failInfo, log.isTraceEnabled());
        assertFalse(failInfo, log.isDebugEnabled());
        assertFalse(failInfo, log.isInfoEnabled());
        assertFalse(failInfo, log.isWarnEnabled());
        assertTrue(failInfo, log.isErrorEnabled());
        assertTrue(failInfo, log.isFatalEnabled());
        
        logger.setLevel(Level.FATAL);
        failInfo = "Log level is " + logger.getLevel();
        assertFalse(failInfo, log.isTraceEnabled());
        assertFalse(failInfo, log.isDebugEnabled());
        assertFalse(failInfo, log.isInfoEnabled());
        assertFalse(failInfo, log.isWarnEnabled());
        assertFalse(failInfo, log.isErrorEnabled());
        assertTrue(failInfo, log.isFatalEnabled());
        
        logger.setLevel(Level.OFF);
        failInfo = "Log level is " + logger.getLevel();
        assertFalse(failInfo, log.isTraceEnabled());
        assertFalse(failInfo, log.isDebugEnabled());
        assertFalse(failInfo, log.isInfoEnabled());
        assertFalse(failInfo, log.isWarnEnabled());
        assertFalse(failInfo, log.isErrorEnabled());
        assertFalse(failInfo, log.isFatalEnabled());
    }
}
