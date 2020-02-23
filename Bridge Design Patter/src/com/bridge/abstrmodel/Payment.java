package com.bridge.abstrmodel;

import com.bridge.implmodel.PaymentSystem;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 * 
 * Abstraction
 * 
 */
public abstract class Payment {
	
	public PaymentSystem paymentSystem;
	public abstract void makePayment();
}
