package com.java.oops.examples;

public class ExMultilevelInheritanceMain 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ExMultilevelInheritance shape = new ExMultilevelInheritance("Generic Shape"); 	// Create generic shape (limited functionality)
		//System.out.println(shape.getName());
		
		TwoDimensionalShape rectangle = new TwoDimensionalShape("Rectangle"); 			// Limited 2D shape (can be extended)
		//System.out.println(rectangle.getName());

		Square square = new Square("My Square", 5); 									// Create a Square object
		System.out.println("Square Name: " + square.getName()); 						// Output: Square Name: My Square
		System.out.println("Area of Square: " + square.getArea()); 						// Output: Area of Square: 25.0 (uses overridden method)

		// Rectangle and Shape objects won't have a usable getArea() method.

	}

}
