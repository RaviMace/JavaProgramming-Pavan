package com.java.oops;

/*
 * Method
 * - Method name can be anything
 * - Method may or may not return a value
 * - If method is not returning any value then specify "void"
 * - Method can take parameters/arguments
 * - We have to invoke/call methods explicitly through object
 * - used for specifying logic
 * 
 * Constructor
 * - Constructor name should be same as class name
 * - Constructor will never return a value (not even void)
 * - We don't specify "void"
 * - Constructor can take parameters/arguments
 * - Constructor automatically invoke at the time object creation
 * - used for initializing the values of the variables
 */


public class K_Constructors 
{
	int id;  
    String name;  
    
    //creating a default constructor
    K_Constructors() 
    {
    	id=100;
    	name="Ravi";
    }
    
    //creating a parameterized constructor
    K_Constructors(int id,String n)
    {  
    	// "this" keyword is used to refer that particular variable is class variable, if local and class variable are same
    	this.id = id;  
    	name = n;  
    } 
     
    //method to display the values or for doing operations, why because inside the constructor we can only assign the values
    void display()
    {
    	System.out.println(id+" "+name);
    }
    
    //main method
    public static void main(String args[])
    {  
    	//creating objects
    	K_Constructors s= new K_Constructors();
    	//creating objects and passing values  
    	K_Constructors s1 = new K_Constructors(101,"Karan");  
    	K_Constructors s2 = new K_Constructors(102,"Aryan");  
    	
    	//calling method to display the values of object  
    	s.display();
    	s1.display();  
    	s2.display();  
   }  
}
