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

/**
 * <p>
 * Log Facade supports printf style message format for performance and ease of
 * use. Log facade is a simple wrapper that makes Java 5 features available when
 * using Log4j.
 * </p>
 * 
 * <p>
 * <i>Requires Java 5 or later.</i>
 * </p>
 * 
 * <h4>Log4j style:</h4>
 * 
 * <pre>
 * log.debug(&quot;Log &quot; + &quot;this &quot; + &quot;message&quot;);
 * </pre>
 * 
 * or for better performance if log level isn't enabled:
 * 
 * <pre>
 * if (log.isDebugEnabled()) {
 * 	log.debug(&quot;Log &quot; + &quot;this &quot; + &quot;message&quot;);
 * }
 * </pre>
 * 
 * <h4>Log facade style:</h4>
 * 
 * <pre>
 * log.debug(&quot;Log %s %s&quot;, &quot;this&quot;, &quot;message&quot;);
 * </pre>
 * 
 * <h4>Usage:</h4>
 * 
 * <pre>
 * Log log = LogFactory.getLog(MyClass.class);
 * </pre>
 * 
 * or:
 * 
 * <pre>
 * Log log = LogFactory.getLog(&quot;MyLoggerName&quot;);
 * </pre>
 * 
 * <ul>
 * <li> No need to use <tt>if</tt> statement to check log level before
 * logging. No string manipulation/concatenation is made if log level isn't
 * enabled. </li>
 * <li> No risk of wrapping business logic in <code>if</code> statements when
 * checking if log level is enabled. </li>
 * <li>Less code to write.</li>
 * <li>If you are afraid of loosing 1 or 2 ms because of the creation of new
 * {@link java.lang.String} objects when entering the logging method you can
 * still wrap your log statements with
 * <code>if(log.isDebugEnabled()){ //log here... }</code>. </li>
 * </ul>
 * 
 * <p>
 * For more information on how to format your log messages:
 * </p>
 * 
 * @see String#format(String, Object...)
 * @see Formatter#format(String, Object...)
 * 
 */
public interface Log {

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#TRACE TRACE}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param message Message object to log
	 */
	void trace(String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#TRACE TRACE}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 */
	void trace(Throwable t, String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#TRACE TRACE}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void trace(String message, Object... params);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#TRACE TRACE}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void trace(Throwable t, String message, Object... params);

	/**
	 * Check whether this category is enabled for the
	 * {@link org.apache.log4j.Level#TRACE TRACE} level.
	 * 
	 * @return boolean - <code>true</code> if this category is enabled for
	 *         level TRACE, <code>false</code> otherwise.
	 */
	boolean isTraceEnabled();

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#DEBUG DEBUG}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param message Message object to log
	 */
	void debug(String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#DEBUG DEBUG}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 */
	void debug(Throwable t, String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#DEBUG DEBUG}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void debug(String message, Object... params);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#DEBUG DEBUG}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void debug(Throwable t, String message, Object... params);

	/**
	 * Check whether this category is enabled for the
	 * {@link org.apache.log4j.Level#DEBUG DEBUG} level.
	 * 
	 * @return boolean - <code>true</code> if this category is enabled for
	 *         level DEBUG, <code>false</code> otherwise.
	 */
	boolean isDebugEnabled();

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#INFO INFO}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param message Message object to log
	 */
	void info(String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#INFO INFO}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 */
	void info(Throwable t, String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#INFO INFO}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void info(String message, Object... params);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#INFO INFO}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void info(Throwable t, String message, Object... params);

	/**
	 * Check whether this category is enabled for the
	 * {@link org.apache.log4j.Level#INFO INFO} level.
	 * 
	 * @return boolean - <code>true</code> if this category is enabled for
	 *         level INFO, <code>false</code> otherwise.
	 */
	boolean isInfoEnabled();

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#WARN WARN}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param message Message object to log
	 */
	void warn(String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#WARN WARN}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 */
	void warn(Throwable t, String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#WARN WARN}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void warn(String message, Object... params);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#WARN WARN}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void warn(Throwable t, String message, Object... params);

	/**
	 * Check whether this category is enabled for the
	 * {@link org.apache.log4j.Level#WARN WARN} level.
	 * 
	 * @return boolean - <code>true</code> if this category is enabled for
	 *         level WARN, <code>false</code> otherwise.
	 */
	boolean isWarnEnabled();

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#ERROR ERROR}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param message Message object to log
	 */
	void error(String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#ERROR ERROR}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 */
	void error(Throwable t, String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#ERROR ERROR}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void error(String message, Object... params);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#ERROR ERROR}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void error(Throwable t, String message, Object... params);

	/**
	 * Check whether this category is enabled for the
	 * {@link org.apache.log4j.Level#ERROR ERROR} level.
	 * 
	 * @return boolean - <code>true</code> if this category is enabled for
	 *         level ERROR, <code>false</code> otherwise.
	 */
	boolean isErrorEnabled();

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#FATAL FATAL}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param message Message object to log
	 */
	void fatal(String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#FATAL FATAL}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 */
	void fatal(Throwable t, String message);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#FATAL FATAL}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void fatal(String message, Object... params);

	/**
	 * Log a message object with the {@link org.apache.log4j.Level#FATAL FATAL}
	 * level.
	 * 
	 * @see org.apache.log4j.Logger#debug(Object)
	 * @see String#format(String, Object...)
	 * @see Formatter#format(String, Object...)
	 * @param t The exception to log, including it's stacktrace
	 * @param message Message object to log
	 * @param params Formatting parameters
	 */
	void fatal(Throwable t, String message, Object... params);

	/**
	 * Check whether this category is enabled for the
	 * {@link org.apache.log4j.Level#FATAL FATAL} level.
	 * 
	 * @return boolean - <code>true</code> if this category is enabled for
	 *         level FATAL, <code>false</code> otherwise.
	 */
	boolean isFatalEnabled();
}
