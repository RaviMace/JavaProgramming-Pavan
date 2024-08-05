package com.java.oops;

public class J_ClassAndObjects 
{
	// Variables
	int id;
	String name;
	String job;
	int sal;
	
	// Methods
	void display() 
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}
	
	// Main Method - like its the starting point of the java, which help to run/compile the program
	// Main Method can be created in separate class and call the other methods for other classes by creating object
	public static void main(String[] args) 
	{
		J_ClassAndObjects emp1= new J_ClassAndObjects();
		
		emp1.id=101;
		emp1.name="Ravi";
		emp1.job="QA";
		emp1.sal=10000;
		emp1.display();
	}

}
 