package com.java.practice;

public class CountNumberOfDigitsInANumber 
{
	public static void main(String[] args) 
	{
		// count number of digits in a number
		long n = 345289467;
		int tempN = 0;
        while (n != 0) 
        {
            n = n / 10;
            ++tempN;
        }
        System.out.println("Number of digits : " + tempN);
        
        // count number of even and odd digits in a number
        int even = 0, odd=0;
        int a = 345289467;
        while (a != 0) 
        {
            a = a / 10;
            if(a%2==0) 
            {
            	++even;
            }
            else 
            {
            	++odd;
            }
        }
        System.out.println("Number of digits in even : " + even);
        System.out.println("Number of digits in odd : " + odd);
	}

}
