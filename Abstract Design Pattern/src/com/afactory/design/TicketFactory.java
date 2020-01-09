package com.afactory.design;

import com.afactory.constants.Constants;
import com.afactory.model.ACSemiSleeper;
import com.afactory.model.ACSleeper;
import com.afactory.model.Bus;
import com.afactory.model.SemiSleeper;
import com.afactory.model.Sleeper;
import com.afactory.model.Ticket;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class TicketFactory extends AbstractFactory{

	@Override
	public Bus getBus(String type) {
		return null;
	}

	@Override
	public Ticket getTicket(String type) {
		Ticket ticket = null;
		switch(type.toUpperCase())
		{
			case Constants.SLEEPER: ticket = new Sleeper();
					break;
			case Constants.AC_SLEEPER: ticket = new ACSleeper();
					break;
			case Constants.SEMI_SLEEPER: ticket = new SemiSleeper();
					break;
			case Constants.AC_SEMI_SLEEPER: ticket = new ACSemiSleeper();
					break;
			default : System.out.println(ticket + " : Ticket not found !!");
		}
		return ticket;
	}
	
}
