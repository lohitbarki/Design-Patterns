package com.template.design;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public abstract class DriveVehicle {
	
	public abstract void changeGear();
	public abstract void steer();
	public abstract void applyBreak();
	
	public final void driveToDestination(String dest) {
		changeGear();
		steer();
		applyBreak();
		
		System.out.println("Reached destination " + dest);
	}
}
