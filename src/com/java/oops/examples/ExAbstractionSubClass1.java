package com.java.oops.examples;

//Define another subclass Cat that extends the abstract class Animal
public class ExAbstractionSubClass1 extends ExAbstractionClass
{
    // Implement the abstract method makeSound
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
