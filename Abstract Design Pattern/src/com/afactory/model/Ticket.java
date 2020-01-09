package com.afactory.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public abstract class Ticket {

	double fare;
	abstract void setFare(double fare);
	
	public double getTicketFare(int numSeats) {
		return (fare*numSeats);
	}
}
