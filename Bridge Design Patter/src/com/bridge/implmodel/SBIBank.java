package com.bridge.implmodel;

import com.bridge.constants.Constants;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 * 
 * Concrete Implementor
 * 
 */
public class SBIBank implements PaymentSystem{
	@Override
	public void processPayment(String type) {
		
		System.out.println(Constants.SBI + " gateway used for " + type);
	}
}
