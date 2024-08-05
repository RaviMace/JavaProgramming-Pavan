package com.java.oops.examples;

public class ExInheritanceWithFinalMain 
{
	 @SuppressWarnings("unused")
	public static void main(String[] args) 
	 {
		 System.out.println("Start");
		// Creating an Animal object using different constructors
		ExInhertianceWithFinal animal1 = new ExInhertianceWithFinal();
		ExInhertianceWithFinal animal2 = new ExInhertianceWithFinal("Elephant");
		System.out.println();
		System.out.println("Calling overload methods");

		// Calling overloaded methods
        animal1.sound();
        animal1.sound("roar");
        System.out.println();
        
        System.out.println("Creating a Dog object using different constructors");
        // Creating a Dog object using different constructors
        Dog dog1 = new Dog();
        System.out.println();
        Dog dog2 = new Dog("Bulldog", "English Bulldog");
        System.out.println();

        System.out.println("Calling overridden methods");
        // Calling overridden methods
        dog1.sound();
        System.out.println();
        dog2.sound();
        System.out.println();

        System.out.println("Calling overloaded method with final parameter");
        // Calling overloaded method with final parameter
        dog1.sound("bark");
        System.out.println();
        dog2.sound("howl");
        System.out.println();

        System.out.println("Calling final method");
        // Calling final method
        dog1.displayInfo();
        System.out.println();
        dog2.displayInfo();
        System.out.println("END");
	 }
}
