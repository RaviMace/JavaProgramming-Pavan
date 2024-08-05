package com.java;

public class M_ThisKeywords 
{
	// Fields Declared
    String name;
    int age;
 
    // Constructor
    M_ThisKeywords(String name, int age)
    {
        this.name = name;
        //this.age = age;
    }
    
    // Method
    void setData(int age) 
    {
    	this.age=age;
    }
 
    // Getter for name
    public String get_name() 
    { 
    	return name; 
    }
 
    // Setter for name
    public void change_name(String name)
    {
        this.name = name;
    }
 
    // Method to Print the Details of
    // the person
    public void printDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
 
    // main function
    public static void main(String[] args)
    {
        // Objects Declared
        M_ThisKeywords first = new M_ThisKeywords("ABC", 18); 
        M_ThisKeywords second = new M_ThisKeywords("XYZ", 22);
 
        first.setData(18);
        first.printDetails();
        second.setData(22);
        second.printDetails();
        
 
        first.change_name("PQR");
        System.out.println("Name has been changed to for 'first' : " + first.get_name());
    }
}
