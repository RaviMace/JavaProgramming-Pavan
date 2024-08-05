package com.java.oops;

//Grand parent class
interface Vehicle 
{
	// Abstract method (does not have a body)
    void drive();
}

//parent class
abstract class AbstractVehicle implements Vehicle 
{
    // Abstract method (does not have a body)
    public abstract void drive();
    
    // Concrete method
    public void start() 
    {
        System.out.println("Vehicle is starting");
    }
}

// child class 1
class Car extends AbstractVehicle {
    @Override
    public void drive() 
    {
        System.out.println("Car is driving");
    }
   
    // Concrete method
    public void honk() 
    {
        System.out.println("Car honks");
    }
}

//child class 2
class Bike extends AbstractVehicle 
{
    @Override
    public void drive() 
    {
        System.out.println("Bike is driving");
    }
    
    // Concrete method
    public void wheelie() 
    {
        System.out.println("Bike does a wheelie");
    }
}
	
public class S_TypeCastingConcept 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
	//Up-casting: for variables
		int intVal = 100;
        long longVal = intVal; // int to long (widening)
        float floatVal = longVal; // long to float (widening)

        System.out.println("int value: " + intVal);
        System.out.println("long value: " + longVal);
        System.out.println("float value: " + floatVal);
        System.out.println();
        
    //Down-casting: for variables
        double doubleVal = 100.04;
        long longVar = (long) doubleVal; // double to long (narrowing)
        int intVar = (int) longVar; // long to int (narrowing)

        System.out.println("double value: " + doubleVal);
        System.out.println("long value: " + longVar);
        System.out.println("int value: " + intVar);
        System.out.println();
        
    //Type-casting with both class and interface with objects
        // Using Interface and Abstract Class: Up-casting				
        Vehicle vehicleCar = new Car(); // Vehicle reference pointing to a Car object				// up-casting grand parent to child1
        Vehicle vehicleBike = new Bike(); // Vehicle reference pointing to a Bike object			// up-casting grand parent to child2
        //Bike b = (Bike) vehicleCar; // it can be valid as per rule, but it will throw exception

        // Up-casting: Automatically handled
        vehicleCar.drive(); 																		// Output: Car is driving
        vehicleBike.drive(); 																		// Output: Bike is driving
        // vehicleCar.start() instead use this -> ((AbstractVehicle) vehicleCar).start();
        // vehicleCar.honk() instead use this -> ((Car) vehicleCar).honk();
        // vehicleCar.start() instead use this -> ((Bike) vehicleBike).wheelie();
        
        // Calling the concrete method from AbstractVehicle
        AbstractVehicle abstractVehicleCar = (AbstractVehicle) vehicleCar;							// this is down-casting parent to grand parent
        abstractVehicleCar.start(); 																// Output: Vehicle is starting
        // abstractVehicleCar.drive();																// calling parent class method
        // abstractVehicleCar.honk() // instead use this -> ((Car) abstractVehicleCar).honk();
        
        AbstractVehicle abstractVehicleBike = (AbstractVehicle) vehicleBike;						// this is down-casting parent to grand parent
        abstractVehicleBike.start(); 																// Output: Vehicle is starting
        // abstractVehicleCar.drive();																// calling parent class method
        // abstractVehicleBike.wheelie() instead use this -> ((Car) abstractVehicleBike).wheelie();
        
        // Down-casting: Explicitly done with instance of check
        if (vehicleCar instanceof Car) 
        {
            Car car = (Car) vehicleCar;																// down-casting child1 to grand parent
            car.honk(); 																			// Output: Car honks
        }

        if (vehicleBike instanceof Bike) 
        {
            Bike bike = (Bike) vehicleBike;															// down-casting child2 to grand parent
            bike.wheelie(); 																		// Output: Bike does a wheelie
        }

        // Using Class Hierarchy: Up-casting and Down-casting										// for Exception handling
        Vehicle vehicleInstance = new Car(); 														// Up-casting Car to Vehicle

        // Up-casting: Automatically handled
        vehicleInstance.drive(); 																	// Output: Car is driving

        // Down-casting: Explicitly done with instance of check
        if (vehicleInstance instanceof Car) 
        {
            Car specificCar = (Car) vehicleInstance;
            specificCar.honk(); 																	// Output: Car honks
        }

        // Trying to downcast to a wrong type
        try 
        {
            Bike wrongBike = (Bike) vehicleInstance; 												// This will throw ClassCastException
        } 
        catch (ClassCastException e) 
        {
            System.out.println("Cannot cast Car to Bike"); 											// Output: Cannot cast Car to Bike
        }
    }
}

