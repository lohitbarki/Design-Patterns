package com.template.model;

import com.template.design.DriveVehicle;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Bike extends DriveVehicle{

	@Override
	public void changeGear() {
		System.out.println("Bike Gear");
	}

	@Override
	public void steer() {
		System.out.println("Bike Steer");
	}

	@Override
	public void applyBreak() {
		System.out.println("Bike Break");
	}
	
}
