package com.bridge.abstrmodel;

import com.bridge.constants.Constants;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 * 
 * Refined Abstraction
 * 
 */
public class DebitCard extends Payment{

	@Override
	public void makePayment() {
		paymentSystem.processPayment(Constants.DEBITCARD + " card Payment");	
	}
}
