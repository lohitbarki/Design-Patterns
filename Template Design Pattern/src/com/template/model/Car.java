package com.template.model;

import com.template.design.DriveVehicle;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Car extends DriveVehicle{

	@Override
	public void changeGear() {
		System.out.println("Car Gear");
	}

	@Override
	public void steer() {
		System.out.println("Car Steer");
	}

	@Override
	public void applyBreak() {
		System.out.println("Car Break");
	}

}
