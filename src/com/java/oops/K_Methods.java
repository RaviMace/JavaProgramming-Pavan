package com.java.oops;

/* 
 * Block or group of statements which will perform certain task.
 * we have to call the method through objects
 * 
 * 1) no parameters - no return value
 * 2) no parameters - return value
 * 3) take parameters - no return value
 * 4) take parameters - return value
 */

//Java Program to Illustrate Methods

//Importing required classes
// Class 1
// Helper class
class K_Methods 
{
	// 1) Method
	void m1() 
	{
		// no parameters - no return value
		System.out.println("This is Method 1st"); 
	}
	
	// 2) Method
	String m2() 
	{
		// no parameters - return value // "return" keyword is used to return the values
		return("This is Method 2nd");  
	}
	
	// 3) Method
	void m3(String name) 
	{
		// take parameters - no return value // the values are called using object created in main class
		System.out.println("This Method 3rd : " + name);
	}
	
    // Initially taking sum as 0
    // as we have not started computation
    int sum = 0;

    // 4) Method
    // To add two numbers
    public int m4(int a, int b) // take parameters - return value
    {

        // Adding two integer value
        sum = a + b;

        // Returning summation of two values
        return sum;
    }

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1 inside main() method
        K_Methods m = new K_Methods();
        
        m.m1();			  // 
        
        String s2=m.m2(); // "return" keyword is used in methods so assignment statement used to get the value
        
        m.m3("Ravi"); 	  // 

        // Calling method of above class
        // to add two integer
        // using instance created
        int s4 = m.m4(1, 2);

        System.out.println(s2); // "return" keyword is used in methods so printing statement used to get the value
        // Printing the sum of two numbers
        System.out.println("Sum of two integer values :" + s4);
    }
}
