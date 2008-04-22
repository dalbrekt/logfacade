package com.jworx.logfacade;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class Log4jLevelTest {

	Log log;
	Logger logger;

	@Before
	public void setUpTest() {
		log = LogFactory.getLog(Log4jLevelTest.class);
		logger = LogManager.getLoggerRepository().getLogger(Log4jLevelTest.class.getName());
	}

	@Test
	public void verifyIsLevelEnabled() {
		String failInfo;

		logger.setLevel(Level.ALL);
		failInfo = "Current log level is " + logger.getLevel();
		assertTrue(failInfo, log.isTraceEnabled());
		assertTrue(failInfo, log.isDebugEnabled());
		assertTrue(failInfo, log.isInfoEnabled());
		assertTrue(failInfo, log.isWarnEnabled());
		assertTrue(failInfo, log.isErrorEnabled());
		assertTrue(failInfo, log.isFatalEnabled());

		logger.setLevel(Level.TRACE);
		failInfo = "Current log level is " + logger.getLevel();
		assertTrue(failInfo, log.isTraceEnabled());
		assertTrue(failInfo, log.isDebugEnabled());
		assertTrue(failInfo, log.isInfoEnabled());
		assertTrue(failInfo, log.isWarnEnabled());
		assertTrue(failInfo, log.isErrorEnabled());
		assertTrue(failInfo, log.isFatalEnabled());

		logger.setLevel(Level.DEBUG);
		failInfo = "Current log level is " + logger.getLevel();
		assertFalse(failInfo, log.isTraceEnabled());
		assertTrue(failInfo, log.isDebugEnabled());
		assertTrue(failInfo, log.isInfoEnabled());
		assertTrue(failInfo, log.isWarnEnabled());
		assertTrue(failInfo, log.isErrorEnabled());
		assertTrue(failInfo, log.isFatalEnabled());

		logger.setLevel(Level.INFO);
		failInfo = "Current log level is " + logger.getLevel();
		assertFalse(failInfo, log.isTraceEnabled());
		assertFalse(failInfo, log.isDebugEnabled());
		assertTrue(failInfo, log.isInfoEnabled());
		assertTrue(failInfo, log.isWarnEnabled());
		assertTrue(failInfo, log.isErrorEnabled());
		assertTrue(failInfo, log.isFatalEnabled());

		logger.setLevel(Level.WARN);
		failInfo = "Current log level is " + logger.getLevel();
		assertFalse(failInfo, log.isTraceEnabled());
		assertFalse(failInfo, log.isDebugEnabled());
		assertFalse(failInfo, log.isInfoEnabled());
		assertTrue(failInfo, log.isWarnEnabled());
		assertTrue(failInfo, log.isErrorEnabled());
		assertTrue(failInfo, log.isFatalEnabled());

		logger.setLevel(Level.ERROR);
		failInfo = "Current log level is " + logger.getLevel();
		assertFalse(failInfo, log.isTraceEnabled());
		assertFalse(failInfo, log.isDebugEnabled());
		assertFalse(failInfo, log.isInfoEnabled());
		assertFalse(failInfo, log.isWarnEnabled());
		assertTrue(failInfo, log.isErrorEnabled());
		assertTrue(failInfo, log.isFatalEnabled());

		logger.setLevel(Level.FATAL);
		failInfo = "Current log level is " + logger.getLevel();
		assertFalse(failInfo, log.isTraceEnabled());
		assertFalse(failInfo, log.isDebugEnabled());
		assertFalse(failInfo, log.isInfoEnabled());
		assertFalse(failInfo, log.isWarnEnabled());
		assertFalse(failInfo, log.isErrorEnabled());
		assertTrue(failInfo, log.isFatalEnabled());

		logger.setLevel(Level.OFF);
		failInfo = "Current log level is " + logger.getLevel();
		assertFalse(failInfo, log.isTraceEnabled());
		assertFalse(failInfo, log.isDebugEnabled());
		assertFalse(failInfo, log.isInfoEnabled());
		assertFalse(failInfo, log.isWarnEnabled());
		assertFalse(failInfo, log.isErrorEnabled());
		assertFalse(failInfo, log.isFatalEnabled());
	}

	@Test
	public void verifyLogLevel() {
		long size = 0;
		String logInfo = "Test of level: %s";
		String failInfo;

		logger.setLevel(Level.ALL);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size < getLogFileSize());

		logger.setLevel(Level.TRACE);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size < getLogFileSize());

		logger.setLevel(Level.DEBUG);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size < getLogFileSize());

		logger.setLevel(Level.INFO);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size < getLogFileSize());

		logger.setLevel(Level.WARN);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size < getLogFileSize());

		logger.setLevel(Level.ERROR);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size < getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size < getLogFileSize());

		logger.setLevel(Level.FATAL);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size < getLogFileSize());

		logger.setLevel(Level.OFF);
		failInfo = "Current log level is " + logger.getLevel();
		size = getLogFileSize();
		log.trace(logInfo, Level.TRACE);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.debug(logInfo, Level.DEBUG);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.info(logInfo, Level.INFO);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.warn(logInfo, Level.WARN);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.error(logInfo, Level.ERROR);
		assertTrue(failInfo, size == getLogFileSize());
		size = getLogFileSize();
		log.fatal(logInfo, Level.FATAL);
		assertTrue(failInfo, size == getLogFileSize());
	}

	private long getLogFileSize() {
		long size = 0;
		try {
			File f = new File("target/logfacade.log");
			size = f.length();
		} catch (Exception e) {
			return 0;
		}

		return size;
	}
}
