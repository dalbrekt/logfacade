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
package com.jworx.logfacade.jdk14;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import com.jworx.logfacade.Log;

public class LogByJdk14 implements Log {

    protected Logger log;

    public LogByJdk14(String name) {
        log = Logger.getLogger(name);
    }

    private void log(Throwable t, Level level, String message, Object... params) {
        // millis and thread are filled by the constructor
        LogRecord record = new LogRecord(level, String.format(message, params));
        record.setLoggerName(log.getName());
        record.setThrown(t);
        log.log(record);
    }

    public void debug(String message) {
        if (isDebugEnabled()) {
            log(null, Level.FINE, message);
        }
    }

    public void debug(Throwable t, String message) {
        if (isDebugEnabled()) {
            log(t, Level.FINE, message);
        }
    }

    public void debug(String message, Object... params) {
        if (isDebugEnabled()) {
            log(null, Level.FINE, message, params);
        }
    }

    public void debug(Throwable t, String message, Object... params) {
        if (isDebugEnabled()) {
            log(t, Level.FINE, message, params);
        }
    }

    public void error(String message) {
        if (isErrorEnabled()) {
            log(null, Level.SEVERE, message);
        }
    }

    public void error(Throwable t, String message) {
        if (isErrorEnabled()) {
            log(t, Level.SEVERE, message);
        }
    }

    public void error(String message, Object... params) {
        if (isErrorEnabled()) {
            log(null, Level.SEVERE, message, params);
        }
    }

    public void error(Throwable t, String message, Object... params) {
        if (isErrorEnabled()) {
            log(t, Level.SEVERE, message, params);
        }
    }

    public void fatal(String message) {
        if (isFatalEnabled()) {
            log(null, Level.SEVERE, message);
        }
    }

    public void fatal(Throwable t, String message) {
        if (isFatalEnabled()) {
            log(t, Level.SEVERE, message);
        }
    }

    public void fatal(String message, Object... params) {
        if (isFatalEnabled()) {
            log(null, Level.SEVERE, message, params);
        }
    }

    public void fatal(Throwable t, String message, Object... params) {
        if (isFatalEnabled()) {
            log(t, Level.SEVERE, message, params);
        }
    }

    public void info(String message) {
        if (isInfoEnabled()) {
            log(null, Level.INFO, message);
        }
    }

    public void info(Throwable t, String message) {
        if (isInfoEnabled()) {
            log(t, Level.INFO, message);
        }
    }

    public void info(String message, Object... params) {
        if (isInfoEnabled()) {
            log(null, Level.INFO, message, params);
        }
    }

    public void info(Throwable t, String message, Object... params) {
        if (isInfoEnabled()) {
            log(t, Level.INFO, message, params);
        }
    }

    public boolean isDebugEnabled() {
        return log.isLoggable(Level.FINE);
    }

    public boolean isErrorEnabled() {
        return log.isLoggable(Level.SEVERE);
    }

    public boolean isFatalEnabled() {
        return log.isLoggable(Level.SEVERE);
    }

    public boolean isInfoEnabled() {
        return log.isLoggable(Level.INFO);
    }

    public boolean isTraceEnabled() {
        return log.isLoggable(Level.FINEST);
    }

    public boolean isWarnEnabled() {
        return log.isLoggable(Level.WARNING);
    }

    public void trace(String message) {
        if (isTraceEnabled()) {
            log(null, Level.FINEST, message);
        }
    }

    public void trace(Throwable t, String message) {
        if (isTraceEnabled()) {
            log(t, Level.FINEST, message);
        }
    }

    public void trace(String message, Object... params) {
        if (isTraceEnabled()) {
            log(null, Level.FINEST, message, params);
        }
    }

    public void trace(Throwable t, String message, Object... params) {
        if (isTraceEnabled()) {
            log(t, Level.FINEST, message, params);
        }
    }

    public void warn(String message) {
        if (isWarnEnabled()) {
            log(null, Level.WARNING, message);
        }
    }

    public void warn(Throwable t, String message) {
        if (isWarnEnabled()) {
            log(t, Level.WARNING, message);
        }
    }

    public void warn(String message, Object... params) {
        if (isWarnEnabled()) {
            log(null, Level.WARNING, message, params);
        }
    }

    public void warn(Throwable t, String message, Object... params) {
        if (isWarnEnabled()) {
            log(t, Level.WARNING, message, params);
        }
    }
}
