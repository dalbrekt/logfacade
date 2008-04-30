/*
 * Copyright 2007 Tony Dalbrekt, jWorx.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.jworx.logfacade;

import java.util.Formatter;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Log4j implementation of the {@link Log} interface.
 */
public class LogByLog4j implements Log {

	private static final String FQCN = LogByLog4j.class.getName();

	private Logger log;

	/**
	 * Constructor which takes an instance of {@link Logger} as an argument.
	 * 
	 * @param logger Log4j {@link Logger}
	 */
	public LogByLog4j(Logger logger) {
		this.log = logger;
	}

	/**
	 * Common log method that logs a message if given log level is enabled.
	 * 
	 * @param level Level to log
	 * @param t Throwable if any
	 * @param message Message to log
	 * @param params Parameters to insert into message
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 */
	protected void log(Level level, Throwable t, String message, Object... params) {
		log.log(FQCN, level, String.format(message, params), t);
	}

	public void debug(String message) {
		if (isDebugEnabled()) {
			log(Level.DEBUG, null, message);
		}
	}

	public void debug(String message, Object... params) {
		if (isDebugEnabled()) {
			log(Level.DEBUG, null, message, params);
		}
	}

	public void debug(Throwable t, String message) {
		if (isDebugEnabled()) {
			log(Level.DEBUG, t, message);
		}
	}

	public void debug(Throwable t, String message, Object... params) {
		if (isDebugEnabled()) {
			log(Level.DEBUG, t, message, params);
		}
	}

	public void error(String message) {
		if (isErrorEnabled()) {
			log(Level.ERROR, null, message);
		}
	}

	public void error(String message, Object... params) {
		if (isErrorEnabled()) {
			log(Level.ERROR, null, message, params);
		}
	}

	public void error(Throwable t, String message) {
		if (isErrorEnabled()) {
			log(Level.ERROR, t, message);
		}
	}

	public void error(Throwable t, String message, Object... params) {
		if (isErrorEnabled()) {
			log(Level.ERROR, t, message, params);
		}
	}

	public void fatal(String message) {
		if (isFatalEnabled()) {
			log(Level.FATAL, null, message);
		}
	}

	public void fatal(String message, Object... params) {
		if (isFatalEnabled()) {
			log(Level.FATAL, null, message, params);
		}
	}

	public void fatal(Throwable t, String message) {
		if (isFatalEnabled()) {
			log(Level.FATAL, t, message);
		}
	}

	public void fatal(Throwable t, String message, Object... params) {
		if (isFatalEnabled()) {
			log(Level.FATAL, t, message, params);
		}
	}

	public void info(String message) {
		if (isInfoEnabled()) {
			log(Level.INFO, null, message);
		}
	}

	public void info(String message, Object... params) {
		if (isInfoEnabled()) {
			log(Level.INFO, null, message, params);
		}
	}

	public void info(Throwable t, String message) {
		if (isInfoEnabled()) {
			log(Level.INFO, t, message);
		}
	}

	public void info(Throwable t, String message, Object... params) {
		if (isInfoEnabled()) {
			log(Level.INFO, t, message, params);
		}
	}

	public boolean isDebugEnabled() {
		return log.isEnabledFor(Level.DEBUG);
	}

	public boolean isErrorEnabled() {
		return log.isEnabledFor(Level.ERROR);
	}

	public boolean isFatalEnabled() {
		return log.isEnabledFor(Level.FATAL);
	}

	public boolean isInfoEnabled() {
		return log.isEnabledFor(Level.INFO);
	}

	public boolean isTraceEnabled() {
		return log.isEnabledFor(Level.TRACE);
	}

	public boolean isWarnEnabled() {
		return log.isEnabledFor(Level.WARN);
	}

	public void trace(String message) {
		if (isTraceEnabled()) {
			log(Level.TRACE, null, message);
		}
	}

	public void trace(String message, Object... params) {
		if (isTraceEnabled()) {
			log(Level.TRACE, null, message, params);
		}
	}

	public void trace(Throwable t, String message) {
		if (isTraceEnabled()) {
			log(Level.TRACE, t, message);
		}
	}

	public void trace(Throwable t, String message, Object... params) {
		if (isTraceEnabled()) {
			log(Level.TRACE, t, message, params);
		}
	}

	public void warn(String message) {
		if (isWarnEnabled()) {
			log(Level.WARN, null, message);
		}
	}

	public void warn(String message, Object... params) {
		if (isWarnEnabled()) {
			log(Level.WARN, null, message, params);
		}
	}

	public void warn(Throwable t, String message) {
		if (isWarnEnabled()) {
			log(Level.WARN, t, message);
		}
	}

	public void warn(Throwable t, String message, Object... params) {
		if (isWarnEnabled()) {
			log(Level.WARN, t, message, params);
		}
	}
}
