package com.java.oops.examples;

// Here i have extended one parent class and implemented two parent class
public class ExMultipleInheritanceUsingInterfaceMain extends ExMultipleInheritanceUsingInterface3 
													 implements ExMultipleInheritanceUsingInterface1, ExMultipleInheritanceUsingInterface2
{
	@Override
	public void m2() 
	{
		System.out.println(y);
	}

	@Override
	public void m1() 
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		ExMultipleInheritanceUsingInterfaceMain Obj = new ExMultipleInheritanceUsingInterfaceMain();
		Obj.m1();
		Obj.m2();
		Obj.m3();
	}	
}
