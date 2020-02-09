package com.prototype.model;

import com.prototype.design.Prototype;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class PlayerRecord implements Prototype {

	private String name;
	private String address;
	private String sport;
	
	public PlayerRecord(String name, String address, String sport) {
		this.name = name;
		this.address = address;
		this.sport = sport;
	}
	
	public void displayRecord() {
		
		System.out.println("\n********************************************Player Details**********************************************\n");
		System.out.println("Name    : " + name);
		System.out.println("Address : " + address);
		System.out.println("Sport   : " + sport);
		System.out.println("ID      : " + this.hashCode());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	
	@Override
	public Prototype getClone() {
		return new PlayerRecord(name,address,sport);
	}
	
}
