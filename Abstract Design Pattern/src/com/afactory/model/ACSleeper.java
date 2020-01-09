package com.afactory.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ACSleeper  extends Ticket{

	public ACSleeper() {
		fare = 1000.00;
	}
	@Override
	void setFare(double fare) {
		this.fare = fare;
	}
	
}