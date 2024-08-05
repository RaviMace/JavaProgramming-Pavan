package com.java.oops.examples;

public class ExConstructorMain 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
    {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
		ExConstructor geek2 = new ExConstructor("Shikhar");

        // Invoke the constructor with two arguments
		ExConstructor geek3 = new ExConstructor("Dharmesh", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
		ExConstructor geek4 = new ExConstructor(325614567);
    }
}
