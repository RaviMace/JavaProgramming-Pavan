package com.java.practice;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{	
		int n = 123464321;
        // Iterative function to
	    // reverse the digits of number
		int tempN = n;
	    int reversedN = 0;
	    while (tempN > 0) 
	    {
	    	reversedN = reversedN * 10 + tempN % 10;
	    	tempN = tempN / 10;
	    }
	    System.out.println("Reverse of n = " + reversedN);
	    // Checking if n is same
        // as reverse of n
        if (n == reversedN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");  
        
        // for words
        String str = "Radar", reverseStr = "";
        
        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
          reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
          System.out.println(str + " is a Palindrome String.");
        }
        else {
          System.out.println(str + " is not a Palindrome String.");
        }
	}

}
