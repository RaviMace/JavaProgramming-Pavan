package com.java.oops.examples;

public class ExConstructor 
{
	// constructor with one argument
    ExConstructor(String name)
    {
        System.out.println("Constructor with one " + "argument - String : " + name);
    }

    // constructor with two arguments
    ExConstructor(String name, int age)
    {

        System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous..
    ExConstructor(long id)
    {
        System.out.println("Constructor with one argument : " + "Long : " + id);
    }
}

