package com.afactory.design;

import com.afactory.constants.Constants;
import com.afactory.model.Bus;
import com.afactory.model.SRS;
import com.afactory.model.SeaBird;
import com.afactory.model.Ticket;
import com.afactory.model.VRL;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class BusFactory extends AbstractFactory{

	@Override
	public Bus getBus(String type) {
		Bus bus = null;
		switch(type.toUpperCase())
		{
			case Constants.SRS: bus = new SRS();
					break;
			case Constants.VRL: bus = new VRL();
					break;
			case Constants.SEABIRD: bus = new SeaBird();
					break;
			default : System.out.println(type + " : Traveller not found !!");
		}
		return bus;
	}

	@Override
	public Ticket getTicket(String type) {
		return null;
	}

}
