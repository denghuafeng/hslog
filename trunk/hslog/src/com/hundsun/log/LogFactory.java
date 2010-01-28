/**
  * <p>Copyright: Copyright (c) 2009</p>
  * <p>Company: 恒生电子股份有限公司</p>
  */
package com.hundsun.log;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;

/**
 * @author zhangjun
 *
 */
public class LogFactory {
    
	private static Map<String, LogIdentifier> map = new HashMap<String, LogIdentifier>();
	
    @SuppressWarnings("unchecked")
	public static HSLog getLog(Class clazz) {
        return new HSLog(org.apache.commons.logging.LogFactory.getLog(clazz));
    }
    
    @SuppressWarnings("unchecked")
	public static Log getLog(Class clazz, String identifier) {
    	return getLog(clazz, getIdentifier(identifier));
    }
    
    @SuppressWarnings("unchecked")
	public static Log getLog(Class clazz, LogIdentifier identifier) {
    	if (identifier.check()) {
			return org.apache.commons.logging.LogFactory.getLog(clazz);
		}
        return new NopLog();
    }
    
    public static HSLog getLog(String name) {
        return new HSLog(org.apache.commons.logging.LogFactory.getLog(name));
    }
    
    public static Log getLog(String name, String identifier) {
    	return getLog(name, getIdentifier(identifier));
    }
    
    public static Log getLog(String name, LogIdentifier identifier) {
    	if (identifier.check()) {
			return org.apache.commons.logging.LogFactory.getLog(name);
		}
        return new NopLog();
    }
    
    public static LogIdentifier getIdentifier(String name) {
    	LogIdentifier identifier = map.get(name);
    	if (identifier == null) {
    		identifier = new LogIdentifier(name);
			map.put(name, identifier);
		}
    	return identifier;
    }
    
    private static class NopLog implements Log {

		@Override
		public void debug(Object message) {
			
		}

		@Override
		public void debug(Object message, Throwable t) {
			
		}

		@Override
		public void error(Object message) {
			
		}

		@Override
		public void error(Object message, Throwable t) {
			
		}

		@Override
		public void fatal(Object message) {
			
		}

		@Override
		public void fatal(Object message, Throwable t) {
			
		}

		@Override
		public void info(Object message) {
			
		}

		@Override
		public void info(Object message, Throwable t) {
			
		}

		@Override
		public boolean isDebugEnabled() {
			return false;
		}

		@Override
		public boolean isErrorEnabled() {
			return false;
		}

		@Override
		public boolean isFatalEnabled() {
			return false;
		}

		@Override
		public boolean isInfoEnabled() {
			return false;
		}

		@Override
		public boolean isTraceEnabled() {
			return false;
		}

		@Override
		public boolean isWarnEnabled() {
			return false;
		}

		@Override
		public void trace(Object message) {
			
		}

		@Override
		public void trace(Object message, Throwable t) {
			
		}

		@Override
		public void warn(Object message) {
			
		}

		@Override
		public void warn(Object message, Throwable t) {
			
		}
    	
    }
    
}
