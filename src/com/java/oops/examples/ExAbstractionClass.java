package com.java.oops.examples;

//Define an abstract class Animal
abstract class ExAbstractionClass 
{
	// Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

