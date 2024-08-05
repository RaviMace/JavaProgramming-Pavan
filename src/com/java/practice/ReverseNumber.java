package com.java.practice;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int n = 4526;
		// reversed number 
        int rev = 0; 
        // remainder 
        int rem; 
  
        while (n > 0) 
        { 
            rem = n % 10; 
            rev = (rev * 10) + rem; 
            n = n / 10; 
        } 
        System.out.print("Reversed Number is "+rev);
		
		
		/* using string
		int n = 123456; 
        // conversion of int to string 
        String temp = "" + n; 
  
        // creating stringbuilder obj 
        StringBuilder sb = new StringBuilder(temp); 
        // using reverse method to 
        // reverse the obj 
        StringBuilder str = sb.reverse(); 
        // printing reverse number 
        System.out.println(str.toString());
        */
	}
}
