package com.java.oops.examples;

public class ExComplieTimePolyMain 
{
	
	public static void main(String []args) 
	{
		ExComplieTimePoly shape1 = new ExComplieTimePoly(); 			// Uses default constructor
		System.out.println(shape1.getName()); 							// Output: Generic Shape
	
		ExComplieTimePoly square = new ExComplieTimePoly("Square"); 	// Uses constructor with name
		System.out.println(square.getName()); 							// Output: Square
				
		double area = square.getArea(5); 								// Uses overloaded getArea with int argument
		System.out.println("Area of square: " + area); 					// Output: Area of square: 25.0
	}
}
