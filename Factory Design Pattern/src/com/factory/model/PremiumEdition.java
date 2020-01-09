package com.factory.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class PremiumEdition extends Plan{	
	@Override
	public double getPrice() {
		price = 200.00;	
		return price;
	}

}
