package com.java.practice;

public class ExStatic 
{
	// static variable
	static int a=10;
	// non-static variable
	int b=20;
	
	static String s="welcome";
	
	// static method
	static void m1() 
	{
		System.out.println("this is m1 static method");
	}
	// non - static method
	void m2() 
	{
		System.out.println("this is m2 non-static method");
	}
	// non - static method
	void m() 
	{
		// non static method can access both static & non static - variables and methods, but not inside the static method
		m1();
		System.out.println(a);
		m2();
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		// static variables and static methods can accessed without creating any object, by accessing directly
		System.out.println(a);
		m1();
		
		System.out.println();
		
		// non static variables and methods can be accessed only by creating object
		ExStatic m = new ExStatic();
		System.out.println(m.b);
		m.m2();
		
		System.out.println();
		
		m.m();
	}

}
