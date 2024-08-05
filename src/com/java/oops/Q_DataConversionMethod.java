package com.java.oops;

public class Q_DataConversionMethod {

	public static void main(String[] args) {
		// Data Conversion - - very important in Automation testing, in web application all the numeric data will be string. 
		// so to run automation converting number to string will be useful.
		
		// Wrapper class 
		/*
		 * 		Primitive		Non-Primitive/Object
		 * 		  int				Integer
		 * 		  long				Long
		 * 		  byte				Byte
		 * 		  short				Short
		 * 		  float				Float
		 * 		  double			Double
		 * 		  boolean			Boolean
		 * 		  char				Character
		 */
		// 1) String -> int
		
		// String s="welcome";		// cannot convert to into
		
		String i1="10";
		String i2="20";
		System.out.println(Integer.parseInt(i1)+Integer.parseInt(i2));
		
		// 2) String -> double
		String d1="10.5";
		String d2="20.5";
		System.out.println(Double.parseDouble(d1)+Double.parseDouble(d2));
		
		// 3) String -> Boolean 
		String b1="Welcome"; // other than true, if you pass any string that will return false.
		String b2="True";
		System.out.println(Boolean.parseBoolean(b1));
		System.out.println(Boolean.parseBoolean(b2));
		
		// String -> Char - it is not possible
		//String c1="ABC";
		System.out.println();
		
		// 4) Any data type to -> String
		// String.valueOf() -> convert all primitive data types into string format
		int a=10;
		double d=10.5;
		char c='A';
		boolean b=true;
		
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(d);
		String s3 = String.valueOf(c);
		String s4 = String.valueOf(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
