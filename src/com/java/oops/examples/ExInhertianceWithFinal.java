package com.java.oops.examples;

//Base class (Parent)
class ExInhertianceWithFinal 
{
	 String name;

    public ExInhertianceWithFinal() 
    {
        this.name = "Unknown Animal";
        System.out.println("Animal constructor called");
    }

    // Constructor Overloading with final parameters
    public ExInhertianceWithFinal(final String name) 
    {
        this.name = name;
        System.out.println("Animal constructor called with name: " + name);
    }

    // Method to be overridden
    public void sound() 
    {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading with final parameter
    public void sound(final String type) 
    {
        System.out.println("Animal makes a " + type + " sound");
    }
}

// Derived class (Child)
class Dog extends ExInhertianceWithFinal 
{
    String breed;

    // Constructor Overloading with final parameters
    public Dog() 
    {
        super(); // Calls the parent class constructor
        this.breed = "Unknown Breed";
        System.out.println("Dog constructor called");
    }

    public Dog(final String name, final String breed) 
    {
        super(name); // Calls the parent class constructor with name
        this.breed = breed;
        System.out.println("Dog constructor called with name and breed: " + name + ", " + breed);
    }

    // Method Overriding with final parameter
    @Override
    public void sound() 
    {
        super.sound(); // Calls the parent class method
        System.out.println("Dog barks");
    }

    // Method with final parameter
    public void sound(final String type) 
    {
        System.out.println("Dog makes a " + type + " sound");
    }

    // Final method, cannot be overridden
    public final void displayInfo() 
    {
        System.out.println("Name: " + this.name + ", Breed: " + this.breed);
    }
}

