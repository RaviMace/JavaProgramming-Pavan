package com.java.oops.examples;

public class ExEncapsulationMain 
{
	public static void main(String[] args) 
	{
		ExEncapsulation point = new ExEncapsulation(3, 5); 	// Create a point at (3, 5)

		int currentX = point.getX(); 						// Access x-coordinate using getter
		int currentY = point.valueY();						// Access y-coordinate method for the constructor
		System.out.println("X-coordinate: " + currentX); 	// Output: X-coordinate: 3
		System.out.println("Y-coordinate: " + currentY);	// Output: X-coordinate: 5
		
		point.setY(-2); 									// Attempt to set invalid y-coordinate
		point.setY(8); 										// Set valid y-coordinate

		int newY = point.getX();	 						// Access modified y-coordinate using getter
		System.out.println("New Y-coordinate: " + newY); 	// Output: New Y-coordinate: 8

	}

}
