package com.chain.design;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public abstract class Logger {
	
	public int level;
	private Logger nextLogger;
	
	public Logger() {
		level = 0;
		nextLogger = null;
	}
	
	public void setNextlLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level, String msg) {
		if(this.level<=level) {
			displayLogMsg(msg);
		}
		if(nextLogger != null) {
			nextLogger.logMessage(level, msg);
		}
	}
	
	public abstract void displayLogMsg(String msg);
}
