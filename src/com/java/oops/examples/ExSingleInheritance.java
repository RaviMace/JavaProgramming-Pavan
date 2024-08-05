package com.java.oops.examples;

class ExSingleInheritance 
{
	  protected String brand;  // Protected for controlled access
	  private int wheels;  // Encapsulated
	
	  public ExSingleInheritance(String brand, int wheels) 
	  {
		  this.brand = brand;
		  this.wheels = wheels;
	  }
	
	  public void startEngine() 
	  {
		  System.out.println("Generic engine start sound.");
	  }
	
	  public int getWheels() 
	  {
		  return wheels;
	  }
	  
}

class MotorCar extends ExSingleInheritance 
{
	  private String model;

	  MotorCar(String brand, int wheels, String model) 
	  {
		  super(brand, wheels);  // Call base class constructor with arguments
		  this.model = model;
	  }

	  public void startEngine() 
	  {
		  System.out.println(brand + " " + model + " engine starting.");
	  }

	  public String getModel() 
	  {
		  return model;
	  }
	}