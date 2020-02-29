package com.template.core;

import com.template.design.DriveVehicle;
import com.template.model.Bike;
import com.template.model.Car;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class StartDriving {

	public static void main(String[] args) {
		
		DriveVehicle driveBike = new Bike();
		driveBike.driveToDestination("Bangalore");
		
		DriveVehicle driveCar = new Car();
		driveCar.driveToDestination("Bangalore");
	}
}
