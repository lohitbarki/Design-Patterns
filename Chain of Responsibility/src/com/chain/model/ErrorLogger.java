package com.chain.model;

import com.chain.design.Logger;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ErrorLogger extends Logger{

	public ErrorLogger(int level) {
		this.level = level;
	}
	@Override
	public void displayLogMsg(String msg) {
		System.out.println("Error : " + msg);
	}

}
