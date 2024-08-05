package com.java.oops;
/*
 * - Definition				: An interface in Java is a reference type, similar to a class, that can contain only constants, method 
 * 	 signatures, default methods, static methods, and nested types.
 * - Abstract Methods		: All methods in an interface are implicitly public and abstract (unless they are default or static methods).
 * - No Implementation		: Interfaces cannot contain any implementation of methods (except default and static methods).
 * - Multiple Inheritance	: A class can implement multiple interfaces, allowing for a form of multiple inheritance.
 * - Contracts				: Interfaces define a contract that a class must follow, meaning any class that implements an interface 
 * 	 must provide implementations for all of the interface's methods.
 * - Default Methods		: Java 8 introduced default methods, which allow interfaces to provide a method implementation.
 * - Static Methods			: Interfaces can also have static methods which can be called independently of any instance.
 * 
 * // Key points
 * - An interface is blue print of class
 * - Interface contains final and static variables
 * - Interface contains abstract methods(also allowed default methods & static methods from java8 onwards)
 * - An abstract method is a method contains signature but not body(un-implemented method)
 * - Methods in interface are by default public
 * - Interface supports the functionality of multiple inheritance
 * - We can define interface with interface keyword
 * - A class extends another class, an interface extends another interface but a class implements an interface
 * - We can created object reference for interface but we cannot instantiate interface. 
 * 
 */


//Interface definition
//Base Interface
interface Animals 
{
	// Constants (by default it considered as final and static variables)
	int MAX_AGE = 20;
	String CATEGORY = "Mammal";

	// Abstract method
	void sound();

	// Default method
	default void eat(int a, int b, int c) 
	{
		c=a+c;
		System.out.println("Animal is eating " + c);
	}

	// Static method
	static void sleep(String CATAGORY) 
	{
		CATAGORY = "MAMMAL";
		System.out.println("Animal is sleeping " + CATAGORY );
	}

	// Method overloading in interface
	void move();
	void move(String style);
}

//Another interface extending the Animal interface
interface Pet extends Animals 
{
	// Abstract method
	void play();
}

//Base class with constructor overloading
class AnimalBase 
{
	String name;

	// Constructor Overloading
	public AnimalBase() 
	{
		this.name = "Unknown Animal";
		System.out.println("AnimalBase constructor called");
	}

	public AnimalBase(final String name) 
	{
		this.name = name;
		System.out.println("AnimalBase constructor called with name: " + name);
	}

	// Method to be overridden
	public void displayInfo() 
	{
		System.out.println("AnimalBase: Name = " + this.name);
	}
}

//Derived class extending AnimalBase and implementing Pet interface
class Dogs extends AnimalBase implements Pet 
{
	String breed;

	// Constructor Overloading
	public Dogs() 
	{
		super(); // Calls the parent class constructor
		this.breed = "Unknown Breed";
		System.out.println("Dog constructor called");
	}

	public Dogs(final String name, final String breed) 
	{
		super(name); // Calls the parent class constructor with name
		this.breed = breed;
		System.out.println("Dog constructor called with name and breed: " + name + ", " + breed);
	}

	// Method Overriding
	@Override
	public void sound() 
	{
		System.out.println("Dog barks");
	}

	 // Overloaded methods from interface
	 @Override
	 public void move() 
	 {
	     System.out.println("Dog is moving");
	 }
	
	 @Override
	 public void move(final String style) 
	 {
	     System.out.println("Dog is moving in " + style + " style");
	 }
	
	 @Override
	 public void play() 
	 {
	     System.out.println("Dog is playing");
	 }

	 // Overriding method and using super keyword
	 @Override
	 public void displayInfo() 
	 {
	     super.displayInfo(); // Calls the parent class method
	     System.out.println("Dog: Breed = " + this.breed);
	     System.out.println("Max Age: " + MAX_AGE);
	     System.out.println("Category: " + CATEGORY);
	 }

	 // Final method, cannot be overridden
	 public final void showDetails() 
	 {
	     System.out.println("Name: " + this.name + ", Breed: " + this.breed);
	 }
}

public class P_Interface
{
	/* // if the interface is implemented in this class, we have to implement all the methods(all abstract & default)
	 * public void move(String name) { System.out.println(name); } 
	 * public void move() { System.out.println(); } 
	 * public void sound() { System.out.println();}  
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		System.out.println("Start");
        // Using the interface's static method
        Animals.sleep("MAMAL");				// for static method no need to create object, can be accessed directly 
        System.out.println();
/*        
        //Creating an Animals interface Object - we can create and execute as shown below
        Animals sh = new Interface();
        sh.sound();
        sh.eat(MAX_AGE, MAX_AGE, MAX_AGE);
        sh.move(CATEGORY);
*/      
        System.out.println("Creating an AnimalBase object using different constructors");
        // Creating an AnimalBase object using different constructors
        AnimalBase animalBase1 = new AnimalBase();
        AnimalBase animalBase2 = new AnimalBase("Elephant");
        System.out.println();

        System.out.println("Creating a Dog object using different constructors");
        // Creating a Dog object using different constructors
        Dogs dog1 = new Dogs();
        Dogs dog2 = new Dogs("Bulldog", "English Bulldog");
        System.out.println();

        System.out.println("Calling overridden method");
        // Calling overridden method
        dog1.sound();
        dog2.sound();
        System.out.println();

        System.out.println("Calling default method from interface");
        // Calling default method from interface
        dog1.eat(10, 20, 0);
        dog2.eat(20,10, 0);
        System.out.println();
        
        System.out.println("Calling overloaded methods");
        // Calling overloaded methods
        dog1.move();
        dog1.move("fast");
        dog2.move("slow");
        System.out.println();

        System.out.println("Calling interface method");
        // Calling interface method
        dog1.play();
        dog2.play();
        System.out.println();

        System.out.println("Calling overridden method using super");
        // Calling overridden method using super
        dog1.displayInfo();
        dog2.displayInfo();
        System.out.println();

        System.out.println("Calling final method");
        // Calling final method
        dog1.showDetails();
        dog2.showDetails();
        System.out.println("END");
	}
}
