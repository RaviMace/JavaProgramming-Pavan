package com.java.oops;

/*
 *  Wrapping up of data and methods in to single unit(class)
 *  
 *  - All the variables should be private
 *  - For every variable there should be 2 methods (get & set)
 *  - Variables can be operated only through methods
 */

public class L_Encapsulation 
{
	// private variables declared
    // these can only be accessed by
    // public methods of class
    private String name;
    private int roll;
    private int age;
 
    // once the variable is assigned - in eclipse, under "Source" -> click "Generate getters and setter"
    // once clicked for all the assigned variables get and set method will be created
    
    // set method for age to access
    // private variable Age
    public void setAge(int newAge) 
    { 
    	age = newAge; 
    }
 
    // set method for name to access
    // private variable Name
    public void setName(String name)
    {
    	// "this" keyword is used to refer that particular variable is class variable, if local and class variable are same
        this.name = name; // "this" key word can be used in constructors also
    }
 
    // set method for roll to access
    // private variable Roll
    public void setRoll(int newRoll) 
    { 
    	roll = newRoll; 
    }
    
    // get method for age to access
    // private variable Age
    public int getAge() 
    { 
    	return age; 
    }
 
    // get method for name to access
    // private variable Name
    public String getName() 
    { 
    	return name; 
    }
 
    // get method for roll to access
    // private variable Roll
    public int getRoll() 
    { 
    	return roll; 
    }
 
    // Main method
    public static void main(String[] args)
    {
        L_Encapsulation obj = new L_Encapsulation();
 
        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
 
        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
 
        // Direct access of geekRoll is not possible if the main method is created in different class
        // due to encapsulation
        //System.out.println("Geek's roll: " + obj.roll);
    }
}
