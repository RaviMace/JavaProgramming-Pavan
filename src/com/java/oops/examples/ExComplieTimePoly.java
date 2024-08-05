package com.java.oops.examples;

public class ExComplieTimePoly 
{
	  protected String name;
	
	  // Constructor overloading based on number of arguments
	  public ExComplieTimePoly() 
	  {
		  this.name = "Generic Shape";
	  }
	
	  public ExComplieTimePoly(String name) 
	  {
		  this.name = name;
	  }
	
	  // Method overloading based on argument data type
	  public double getArea(double side) 
	  {
		  //throw new UnsupportedOperationException("getArea not implemented for generic Shape");
		  return side * side;
	  }
	
	  public double getArea(int side) 
	  {
		  return side * side;  // Example for square
	  }
	
	  public String getName() 
	  {
		  return this.name;
	  }

}
