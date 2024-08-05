package com.java.practice;

public class TernaryOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String x = 10>100 ? "Star" : "World"; 	// if the value of x/y is true, it will print the value of left hand side
		int y = 100>10 ? 10 : 5;				// if the value of x/y is false, it will print the value of right hand side
		
		System.out.println(x);
		System.out.println(y);
		
		int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);
	}

}
