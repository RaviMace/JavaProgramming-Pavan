package com.java.oops.examples;

public class ExSingleInheritanceMain 
{
	public static void main(String[] args) 
	{
		ExSingleInheritance vehicle = new ExSingleInheritance("Generic", 4);  	// Create generic vehicle (limited functionality)
		vehicle.startEngine(); 													// Output: Generic engine start sound.

		MotorCar car = new MotorCar("Toyota", 4, "Camry"); 						// Create a Car object
		car.startEngine(); 														// Output: Toyota Camry engine starting.
		System.out.println("Car Model: " + car.getModel()); 					// Output: Car Model: Camry
		System.out.println("Number of wheels: " + car.getWheels()); 			// Output: Number of wheels: 4 (inherited)
	}

}
