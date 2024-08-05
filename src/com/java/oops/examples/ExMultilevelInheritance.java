package com.java.oops.examples;

class ExMultilevelInheritance // for the different child class to access this parent class "public" should be included
{

	  protected String name;
	
	  public ExMultilevelInheritance(String name) 
	  {
		  this.name = name;
	  }
	
	  public String getName() 
	  {
		  return this.name;
	  }
}

class TwoDimensionalShape extends ExMultilevelInheritance // if this child class created as different class "public" should be included
{
	  public TwoDimensionalShape(String name) 
	  {
	    super(name);  // Call base class constructor with arguments
	  }
}

class Square extends TwoDimensionalShape 
{
	  private double side;

	  public Square(String name, double side) 
	  {
		  super(name);  // Call intermediate class constructor with arguments
		  this.side = side;
	  }
	  
	  public double getArea() 
	  {
		  return side * side;
	  }
}
