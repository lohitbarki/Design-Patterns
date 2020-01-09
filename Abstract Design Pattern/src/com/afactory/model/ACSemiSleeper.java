package com.afactory.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ACSemiSleeper  extends Ticket{

	public ACSemiSleeper() {
		fare = 600.00;
	}
	@Override
	void setFare(double fare) {
		this.fare = fare;
	}
	
}