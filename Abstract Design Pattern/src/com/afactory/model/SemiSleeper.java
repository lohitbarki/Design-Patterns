package com.afactory.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class SemiSleeper extends Ticket{

	public SemiSleeper() {
		fare = 400.00;
	}
	@Override
	void setFare(double fare) {
		this.fare = fare;
	}
	
}
