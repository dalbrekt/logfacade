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

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Creates and manages log instances.
 */
public class LogFactory {

	// Cache containg unique log instances. No more then one log instance per
	// given name can exist.
	private static final Map<String, Log> logMap = new HashMap<String, Log>();

	/**
	 * Retrieve a log instance named according to the value of the
	 * <code>name</code> parameter. If the named log instance already exists,
	 * then the existing one will be returned. Otherwise, a new instance is
	 * created.
	 * 
	 * @see Logger#getLogger(String)
	 * 
	 * @param name Name of the log instance to retrieve
	 * @return An implementation of the {@link Log} interface
	 */
	public static Log getLog(String name) {
		Log log = null;

		if (logMap.containsKey(name)) {
			log = logMap.get(name);
		} else {
			log = new LogByLog4j(Logger.getLogger(name));
			logMap.put(name, log);
		}
		return log;
	}

	/**
	 * Shortcut for <code>getLogger(clazz.getName())</code>.
	 * 
	 * @param clazz The name of <code>clazz</code> will be used as the name of
	 *        the log instance to retrieve. See {@link getLogger(String)} for
	 *        more detailed information.
	 */
	public static Log getLog(Class<?> clazz) {
		return getLog(clazz.getName());
	}
}
