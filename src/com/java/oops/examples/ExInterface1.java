package com.java.oops.examples;

public interface ExInterface1 
{
	int l=10;
	static int w=20;
	
	void circle();
	
	default void square() 
	{
		System.out.println("This is square - default method : " + (l*w));
	}
	
	static void rectangle() 
	{
		System.out.println("This is rectangle - static method : " + (l*w));
	}
}
