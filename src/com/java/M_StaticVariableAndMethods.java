package com.java;

/*
 * 						Static variable										Non static variable
 * - Static variables can be accessed using class name. | - Non static variables can be accessed using instance of a class
 * - Static variables can be accessed by static and     | - Non static variables cannot be accessed inside a static method.
 *   non static methods.								|
 * - Static variables reduce the amount of memory used  | - Non static variables do not reduce the amount of memory used by a program
 *   by a program.										|
 * - In Static variable Memory is allocated only once,  | - In non Static variable Memory is allocated each time an instance of 
 * 	 at the time of class loading.						|	the class is created.
 * - Static variables Can be accessed from any part of 	| - Non Static variables Can be accessed only within the class or its instance.
 *   the program.										|
 * - Static variables Exists for the entire lifetime of | - Non Static variables Exists for the lifetime of the object.
 *   the program.										|
 * - Static variables Default value is assigned 		| - Non Static variables Default value is not assigned automatically.
 *   automatically.										|
 * - Static variables are shared among all instances of | - Non static variables are specific to that instance of a class.
 *   a class.											|
 * - Static variable is like a global variable and is 	| - Non static variable is like a local variable and they can be accessed through 
 *   available to all methods.							|   only instance of a class.
 */

public class M_StaticVariableAndMethods 
{
	// static variable
    static int a = m1();
    int b= m2();
   
    // static block
    static
    {
        System.out.println("Inside static block");
    }
   
    // static method
    static int m1()
    {
        System.out.println("from m1");
        return 20;
    }
    
    // non static method
    int m2() {
		
    	//System.out.println("from m2");
		return 40;
	}

	// non static method - overloading m1() static method 
    int m1(int a) 
    {
    	System.out.println("Inside non static block");
		System.out.println("from m1 non static");
    	return 30;
	}
   
    // static method(main !!)
    // But it can be accessed within the same class, if its in different class we have specify "class name" under the main method
    public static void main(String[] args)
    {
    	// static methods
        System.out.println("Value of a : " + a);
        System.out.println("from main");
        
        // non static methods
        M_StaticVariableAndMethods  ns= new M_StaticVariableAndMethods();
        System.out.println(ns.m1(a));
        System.out.println(ns.m2());
        
        
    }
}
