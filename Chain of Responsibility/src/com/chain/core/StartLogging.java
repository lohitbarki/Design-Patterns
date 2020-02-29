package com.chain.core;

import com.chain.constants.Constants;
import com.chain.design.Logger;
import com.chain.model.DebugLogger;
import com.chain.model.ErrorLogger;
import com.chain.model.OutputLogger;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class StartLogging {

	private static Logger initChain() {
		
		Logger ouputLgger = new OutputLogger(Constants.OUTPUTLOG);
		
		Logger errorLogger = new ErrorLogger(Constants.ERRORLOG);
		ouputLgger.setNextlLogger(errorLogger);
		
		Logger debugLogger = new DebugLogger(Constants.DEBUGTLOG);
		errorLogger.setNextlLogger(debugLogger);
		
		return ouputLgger;
	}
	
	public static void main(String[] args) {
		
		Logger logger = initChain();
		
		logger.logMessage(Constants.OUTPUTLOG, "Output is here!!");
		logger.logMessage(Constants.ERRORLOG, "Encountered error!!");
		logger.logMessage(Constants.DEBUGTLOG, "Debug messages!!");
	}
}
