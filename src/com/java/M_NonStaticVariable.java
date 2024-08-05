package com.java;

public class M_NonStaticVariable 
{
	public static void main(String[] args) 
	{	 
		// Non static variable is also know as local variable
        // if we try to call non-static method without using instance from static method it will get error 
		// (or) Non-static method 'getName()' cannot be referenced from a static context
        // getName();
		M_NonStaticVariable student = new M_NonStaticVariable();
        student.greet("Knoldus");
    }
    public void greet(String name)
    {
        System.out.println("Hello  " + name);
    }
}
