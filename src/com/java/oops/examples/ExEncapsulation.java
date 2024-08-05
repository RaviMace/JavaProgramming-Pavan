package com.java.oops.examples;

public class ExEncapsulation 
{
	private int x;
	private int y;
	
	// Constructor to initialize both coordinates
	public ExEncapsulation(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	// Created method to return the value "Y" of constructor
	int valueY()
	{
		return y;
		//System.out.println(y);
	}
	
	// Public methods to access coordinates (Getters)
	public int getX() 
	{
		return this.x;
	}
	
	// Public method to modify y-coordinate with validation (Setter)
	public void setY(int newY) 
	{
		if (newY >= 0) 
		{ // Add validation logic here (optional)
			this.y = newY;
		} 
		else 
		{
			System.out.println("Error: Y-coordinate cannot be negative.");
	    }
	}
}
