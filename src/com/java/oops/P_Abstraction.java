package com.java.oops;

//Define an abstract class Animal
abstract class DomesticAnimal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("This animal eats food.");
    }
    
    // Constructor
    DomesticAnimal() {
    	System.out.println("This animal is domestic animal");
    }
}

// Define a subclass Dog that extends the abstract class Animal
class Doggy extends DomesticAnimal { 
    // Implement the abstract method makeSound
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Define another subclass Cat that extends the abstract class Animal
class Cats extends DomesticAnimal {
    // Implement the abstract method makeSound
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
class P_Abstraction 
{
	 public static void main(String[] args) {
	    //DomesticAnimal animal = new DomesticAnimal(); // This will cause a compilation error
		//animal.eat();
	
	    // Instantiate Dog and Cat objects
	    DomesticAnimal dog = new Doggy();
	    DomesticAnimal cat = new Cats();
	
	    // Call the makeSound method on each object
	    dog.makeSound(); // Output: The dog barks.
	    cat.makeSound(); // Output: The cat meows.
	
	    // Call the eat method on each object
	    dog.eat(); // Output: This animal eats food.
	    cat.eat(); // Output: This animal eats food.
	}
}

