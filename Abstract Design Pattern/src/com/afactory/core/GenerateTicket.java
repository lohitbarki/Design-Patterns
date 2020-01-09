package com.afactory.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.afactory.design.BusFactory;
import com.afactory.design.FactoryInit;
import com.afactory.design.TicketFactory;
import com.afactory.model.Bus;
import com.afactory.model.Sleeper;
import com.afactory.model.Ticket;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class GenerateTicket {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BusFactory busFactory = (BusFactory) FactoryInit.getFactory("Bus");
		
		System.out.println("Choose traveller : ");
		System.out.println(" 1 - SRS \n 2 - VRL \n 3 - SeaBird");
		
		String busTravels = br.readLine();
		Bus bus = null;
		
		switch(busTravels)
		{
			case "1": bus = busFactory.getBus("SRS");
				break;
			case "2": bus = busFactory.getBus("VRL");
				break;
			case "3": bus = busFactory.getBus("SeaBird");
				break;
			default : System.out.print("Inavlid option..");
				return;
		}
		
		TicketFactory ticketFactory = (TicketFactory) FactoryInit.getFactory("Ticket");
		
		System.out.println("Choose ticket type :  ");
		System.out.println(" 1 - Sleeper \n 2 - AC Sleeper \n 3 - Semi Sleeper \n 4 - AC Semi Sleeper \n");
		
		String ticketType = br.readLine();
		Ticket ticket;
		
		switch(ticketType)
		{
			case "1": ticket = (Sleeper)ticketFactory.getTicket("Sleeper");
				break;
			case "2": ticket = ticketFactory.getTicket("AC sleeper");
				break;
			case "3": ticket = ticketFactory.getTicket("Semi sleeper");
				break;
			case "4": ticket = ticketFactory.getTicket("AC Semi sleeper");
				break;
			default : System.out.print("Inavlid option..");
				return;
		}
		
		System.out.println("Enter number of seats : ");
		Integer numSeats = Integer.parseInt(br.readLine());
		
		System.out.println("*****************************  TICKET **********************************\n");
		System.out.println("\t\t " + bus.getBusTravelsName() + " Travels");
		System.out.println("\t\t No. of Seats : " + numSeats);
		System.out.println("\t\t Fare : " + ticket.getTicketFare(numSeats));
		System.out.println("\n**************************  Happy Journey ******************************");
	}
}
