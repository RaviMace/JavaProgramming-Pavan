package com.java.oops.examples;
public class ExAbstrationMain 
{
	public static void main(String[] args) 
	{
        //AbstractionClass animal = new AbstractionClass(); // This will cause a compilation error

        // Instantiate Dog and Cat objects
		ExAbstractionClass cat = new ExAbstractionSubClass1();
		// we can't instantiate both dog and cat because abstract class is extended for both class
		// creating object is only possible if both the class are separate
		ExAbstractionClass dog = new ExAbstractionSubClass2();
		
		// We can also create like this
		//AbstractionSubClass1 cat1 = new AbstractionSubClass1();
		//AbstractionSubClass2 dog1 = new AbstractionSubClass2();
        
        // Call the makeSound method on each object
        dog.makeSound(); // Output: The dog barks.
        cat.makeSound(); // Output: The cat meows.

        // Call the eat method on each object
        dog.eat(); // Output: This animal eats food.
        cat.eat(); // Output: This animal eats food.
    }
}
