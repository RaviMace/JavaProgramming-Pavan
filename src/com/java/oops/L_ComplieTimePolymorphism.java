package com.java.oops;

/*
 * Overloading
 * - one thing can have many forms
 * 
 * - Shape -- circle, square, triangle, rectangle etc..
 * - Water -- vapor, ice cube etc..
 * 
 * we can achieve polymorphism using overloading which comes under compile time polymorphism
 * 
 * 4 rules are applicable
 * - Method name should be same
 * - number of parameters should be different
 * - data type of parameters should be different
 * - order of parameters should be different
 */

public class L_ComplieTimePolymorphism 
{
	int a=10, b=20; // Integer is assigned as class variable and assigned with value to run the 1st methods
	double x,y,z; // double is assigned for constructor
	
	// 1st Method
	void Multiply()						
	{
		System.out.println(a * b);
	}
	
	// 2nd Method
	void Multiply(int a, int b) 
    {
        System.out.println(a * b);
    }

    // 3rd Method
    // With same name but with 2 double parameters
    void Multiply(double a, double b) // overloading above method
    {
    	System.out.println(a * b);
    }
    
    // 4th Method
 	void Multiply(int a, double b) // overloading above method
     {
         System.out.println(a * b);
     }
 	
 	// 5th Method
 	void Multiply(int a, int b,int c) // overloading above method
     {
         System.out.println(a * b * c);
     }
 	
 	// 6th Method
 	double Multiply(double a, int b) // using return // overloading above method
 	{
 		return (a*b);
 	}
 	
 	// 1st Constructor
 	L_ComplieTimePolymorphism()
 	{
 		x=10;
 		y=20;
 		z=10;
 	}
 	
 	// 2nd Constructor
  	L_ComplieTimePolymorphism(double xy,double yx,double zy)
  	{
  		x=xy;
  		y=yx;
  		z=zy;
  	}
  	
  	// 3rd Constructor
  	L_ComplieTimePolymorphism(double l) 
  	{
  		x=y=z=l;
  	}
  	
  	//method to display the values or for doing operations, why because inside the constructor we can only assign the values
  	double volume() 
  	{
  		return (x*y*z);
  	}
 
    // Main driver method
    public static void main(String[] args) 
    {
    	// for methods
        L_ComplieTimePolymorphism mObj = new L_ComplieTimePolymorphism();
		// Calling method by passing
        // input as in arguments
        System.out.println("Method in Complie time polymorphism");
        mObj.Multiply();
        mObj.Multiply(10, 30);
        mObj.Multiply(10.5, 1.5);
        mObj.Multiply(10, 1.5);
        mObj.Multiply(10, 20, 30);
        System.out.println(mObj.Multiply(1.5, 20));
        System.out.println();
        
        // for constructor
        L_ComplieTimePolymorphism cObj = new L_ComplieTimePolymorphism();
        L_ComplieTimePolymorphism c1Obj = new L_ComplieTimePolymorphism(10.5,5.0,2.5);
        // Calling method for the constructor
        // input as in arguments
        System.out.println("Constructor in Complie time polymorphism");    
        System.out.println(cObj.volume());
        System.out.println(c1Obj.volume());
    }
    
}
