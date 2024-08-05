package com.java;

public class B_VariablesAndDataType {

	public static void main(String[] args) {
		
		int a = 100;
		int x = 200, y;
		
		y = a + x;
		
		System.out.println("value of the y is: " + y);
		
		// data types - primitive and non-primitive
		
		// Primitive
		/* Boolean data type represents only one bit of information either true or false 
		which is intended to represent the two truth values of logic and Boolean algebra, 
		but the size of the boolean data type is virtual machine-dependent. 
		Values of type boolean are not converted implicitly or explicitly (with casts) to any other type. 
		But the programmer can easily write conversion code.
		*/
		boolean booleanVar=true;
		
		// Creating and initializing custom character
        char z = 'G';

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        // use byte and short
        // if memory is a constraint
        byte b = 4;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        short s = 56;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;

        System.out.println("boolean: " + booleanVar);
        System.out.println("char: " + z);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
		
        // Non-primitive
        // String, ArrayList, HashMap, HashSet etc..
		
	}

}
