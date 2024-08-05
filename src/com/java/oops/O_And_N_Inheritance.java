package com.java.oops;

/*
 * - Inheritance is a mechanism that allows one class to inherit the fields and methods of another class.
 * - The inheriting class is called the subclass or child class, while the class being inherited from is 
 *   called the superclass or parent class.
 * - The subclass inherits all the fields and methods of the superclass and can also add new fields and 
 *   methods or override the ones inherited from the superclass.
 *   
 *   Types of Inheritance in Java:
 *   
 * 1. Single Inheritance     	: A subclass inherits from a single superclass.
 * 2. Multilevel Inheritance	: A subclass inherits from a superclass, which in turn inherits from another superclass.
 * 3. Hierarchical Inheritance	: Multiple subclasses inherit from a single superclass.
 * 4. Multiple Inheritance 		: A subclass inherits from multiple super-classes (not allowed in Java, 
 *    but can be achieved using interfaces). - * (not supported in Java) *
 * 5. Hybrid Inheritance       	: A combination of multiple and multilevel inheritance (not allowed in Java). - * (not supported in Java) *
 * 
 * 	 Key concepts:
 *
 * - Extends keyword			: used to inherit from a superclass.
 * - Super keyword				: used to access the superclass's members.
 * - Override					: used to provide a different implementation of a method inherited from the superclass.
 * - Method Overriding			: providing a different implementation of a method inherited from the superclass. we can't override constructor.
 * - Method Overloading			: having multiple methods with the same name but different parameters. we can overloading constructor.
 */

//Java program to illustrate the
//concept of inheritance
//with overriding in the concept of inheritance, this can be done in inheritance only

//Single Inheritance:

// Superclass
class Animal 
{
	void sound() 
	{
		System.out.println("Animal makes a sound");
	}
}

// Subclass inheriting from Animal
class Dog extends Animal 
{
	void sound() // overriding the parent class method
	{
		System.out.println("Dog barks");
	}
}

//Multilevel Inheritance:

// Superclass
class Animal_M 
{
	void sound() 
	{
		System.out.println("Animal makes a sound");
	}
}

// Subclass inheriting from Animal - it act as subclass for superclass(Animal_M) and also act as superclass for subclass(Cat_M)
class Mammal_M extends Animal_M
{
	void sound() // overriding the parent class method
	{
		System.out.println("Mammal makes a sound");
	}
}

// Subclass inheriting from Mammal
class Cat_M extends Mammal_M
{
	void catSound() // overriding the parent class method
	{
		System.out.println("Cat meows");
	}
}

//Hierarchical Inheritance:

// Superclass
class Animal_H 
{
	void sound() 
	{
		System.out.println("Animal makes a sound");
	}
}

// Subclass inheriting from Animal
class duck_H extends Animal_H
{
	void sound() // overriding the parent class method
	{
		System.out.println("Duck quaks");
	}
}

// Another subclass inheriting from Animal
class cow_H extends Animal_H
{
	void sound() // overriding the parent class method
	{
		System.out.println("Cow moo's");
	}
}

// Main class for all three Inheritance
public class O_And_N_Inheritance 
{
	public static void main(String[] args) 
	{
		// example call the class for overriding
		Animal a = new Animal();
		a.sound();
		//Single Inheritance:					- for a parent class(superclass), it will have only one child class(subclass)
		Dog myDog = new Dog();					// "Dog" class overrides the "Animal" class methods
		myDog.sound(); // Output: Dog barks
		//Multilevel Inheritance:				- it goes like g.parent class(superclass) -> parent class(superclass/subclass) -> child class(subclass)
		Cat_M myCat = new Cat_M();
		myCat.catSound(); // Output: Cat meow's
		//Hierarchical Inheritance:				- for a parent class(super class), it will have multiple child class(subclass 1,2,3..etc.,)
		duck_H myDuck = new duck_H();
		myDuck.sound(); // Output: Duck quak's
		
		cow_H myCow = new cow_H();
		myCow.sound(); // Output: Cow moo's
	}
}

