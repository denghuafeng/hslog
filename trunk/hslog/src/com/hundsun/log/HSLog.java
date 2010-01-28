/**
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: 恒生电子股份有限公司</p>
 */
package com.hundsun.log;

import org.apache.commons.logging.Log;


/**
 * @author zhangjun
 * 
 */
public class HSLog implements Log {

	private Log log;

	public HSLog(Log log) {
		this.log = log;
	}

	@Override
	public void debug(Object message) {
		log.debug(message);
	}

	@Override
	public void debug(Object message, Throwable t) {
		log.debug(message, t);
	}

	public void debug(Object message, LogIdentifier identifier) {
		if (identifier.check()) {
			debug(message);
		}
	}

	public void debug(Object message, Throwable t, LogIdentifier identifier) {
		if (identifier.check()) {
			debug(message, t);
		}
	}

	@Override
	public void error(Object message) {
		log.error(message);
	}

	@Override
	public void error(Object message, Throwable t) {
		log.error(message, t);
	}

	public void error(Object message, LogIdentifier identifier) {
		if (identifier.check()) {
			error(message);
		}
	}

	public void error(Object message, Throwable t, LogIdentifier identifier) {
		if (identifier.check()) {
			error(message, t);
		}
	}

	@Override
	public void fatal(Object message) {
		log.fatal(message);
	}

	@Override
	public void fatal(Object message, Throwable t) {
		log.fatal(message, t);
	}

	public void fatal(Object message, LogIdentifier identifier) {
		if (identifier.check()) {
			fatal(message);
		}
	}

	public void fatal(Object message, Throwable t, LogIdentifier identifier) {
		if (identifier.check()) {
			fatal(message, t);
		}
	}

	@Override
	public void info(Object message) {
		log.info(message);
	}

	@Override
	public void info(Object message, Throwable t) {
		log.info(message, t);
	}

	public void info(Object message, LogIdentifier identifier) {
		if (identifier.check()) {
			info(message);
		}
	}

	public void info(Object message, Throwable t, LogIdentifier identifier) {
		if (identifier.check()) {
			info(message, t);
		}
	}

	@Override
	public void trace(Object message) {
		log.trace(message);
	}

	@Override
	public void trace(Object message, Throwable t) {
		log.trace(message, t);
	}

	public void trace(Object message, LogIdentifier identifier) {
		if (identifier.check()) {
			trace(message);
		}
	}

	public void trace(Object message, Throwable t, LogIdentifier identifier) {
		if (identifier.check()) {
			trace(message, t);
		}
	}

	@Override
	public void warn(Object message) {
		log.warn(message);
	}

	@Override
	public void warn(Object message, Throwable t) {
		log.warn(message, t);
	}

	public void warn(Object message, LogIdentifier identifier) {
		if (identifier.check()) {
			warn(message);
		}
	}

	public void warn(Object message, Throwable t, LogIdentifier identifier) {
		if (identifier.check()) {
			warn(message, t);
		}
	}

	@Override
	public boolean isDebugEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isErrorEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isFatalEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isInfoEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isTraceEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isWarnEnabled() {
		throw new UnsupportedOperationException();
	}

}
