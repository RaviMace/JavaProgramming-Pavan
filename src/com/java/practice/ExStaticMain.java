package com.java.practice;

public class ExStaticMain 
{
	public static void main(String[] args) 
	{
		// static variables and static methods can accessed without creating any object, by accessing directly
		// But it can be accessed within the same class, if its in different class we have specify "class name"
		System.out.println(ExStatic.a);
		ExStatic.m1();
		
		System.out.println(ExStatic.s.length());
		
		System.out.println();
		
		// non static variables and methods can be accessed only by creating object
		// for others not problem to access from different class
		ExStatic m = new ExStatic();
		System.out.println(m.b);
		m.m2();
		
		System.out.println();
		
		m.m();
	}
}
