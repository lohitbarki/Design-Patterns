package com.afactory.design;

import com.afactory.model.Bus;
import com.afactory.model.Ticket;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
abstract class AbstractFactory {

	public abstract Bus getBus(String type);
	public abstract Ticket getTicket(String type);
}
