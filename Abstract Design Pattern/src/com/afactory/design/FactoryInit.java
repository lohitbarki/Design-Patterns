package com.afactory.design;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class FactoryInit {
	public static AbstractFactory getFactory(String instance) {
		
		AbstractFactory abstractFactory = null;
		
		if(instance.equalsIgnoreCase("Bus")) {
			abstractFactory = new BusFactory();
		}
		else if(instance.equalsIgnoreCase("Ticket")) {
			abstractFactory = new TicketFactory();
		}
		else {
			System.out.println("Factory instance not found!!");
		}
		return abstractFactory;
	}
}
