package com.factory.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public abstract class Plan {
	
	protected double price;
	public abstract double getPrice();
	
	public double calcBill(int units){
		return price*units;
	}
}
