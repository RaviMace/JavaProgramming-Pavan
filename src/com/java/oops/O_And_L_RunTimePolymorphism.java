package com.java.oops;

/*
 * Also known as method overriding, runtime polymorphism occurs when a subclass provides a specific implementation of a method 
 * that is already defined in its superclass. The method to be executed is determined at runtime based on the object's actual class type, 
 * not the reference type.
 * 
 * Characteristics:
 * - Method Overriding: Achieved by providing a specific implementation of a method in a subclass that has the same signature 
 *   (name, return type, and parameters) as a method in the superclass.
 * - Binding: Method binding is done at runtime using dynamic dispatch.
 * - Inheritance: Requires inheritance where a subclass overrides methods of its superclass. (it can be done in interface also)
 */

//Base class
class Vehicles {
 // Method to be overridden
 public void start() {
     System.out.println("Vehicle is starting");
 }
 
 public void stop() {
     System.out.println("Vehicle is stopping");
 }
 
 public void fuelType() {
     System.out.println("Fuel type is generic");
 }
}

//Intermediate class inheriting from Vehicle
class Cars extends Vehicles {
 // Overriding the start method
 @Override
 public void start() {
     System.out.println("Car is starting with a roar");
 }
 
 // Overriding the fuelType method
 @Override
 public void fuelType() {
     System.out.println("Car uses gasoline");
 }
}

//Subclass inheriting from Car
class ElectricCar extends Cars {
 // Overriding the start method
 @Override
 public void start() {
     System.out.println("Electric car is starting silently");
 }
 
 // Overriding the stop method
 @Override
 public void stop() {
     System.out.println("Electric car is stopping with regenerative braking");
 }
 
 // Overriding the fuelType method
 @Override
 public void fuelType() {
     System.out.println("Electric car uses electricity");
 }
}

// Main class
public class O_And_L_RunTimePolymorphism 
{
	public static void main(String[] args) {
        // Reference type is Vehicle, but actual object types are different
        Vehicles myVehicle;
        
        myVehicle = new Vehicles();
        myVehicle.start(); 										// Output: Vehicle is starting
        myVehicle.stop();  										// Output: Vehicle is stopping
        myVehicle.fuelType(); 									// Output: Fuel type is generic
        
        myVehicle = new Cars(); //Up-casting Vehicles	
        myVehicle.start(); 										// Output: Car is starting with a roar
        myVehicle.stop();  										// Output: Vehicle is stopping (inherited from Vehicle)
        myVehicle.fuelType(); 									// Output: Car uses gasoline
        
        myVehicle = new ElectricCar(); //Up-casting Vehicles
        myVehicle.start(); 										// Output: Electric car is starting silently
        myVehicle.stop();  										// Output: Electric car is stopping with regenerative braking
        myVehicle.fuelType(); 									// Output: Electric car uses electricity
    }
}
