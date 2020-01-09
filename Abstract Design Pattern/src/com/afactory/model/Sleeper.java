package com.afactory.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Sleeper  extends Ticket{

	public Sleeper(){
		fare = 800.00;
	}
	@Override
	void setFare(double fare) {
		this.fare = fare;
	}
	
}