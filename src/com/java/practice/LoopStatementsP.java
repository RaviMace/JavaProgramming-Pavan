package com.java.practice;

public class LoopStatementsP 
{
	public static void main(String[] args) 
	{
		int i=1;
		
		// while loop
		while (i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i+" Even");
			}
			else
			{
				System.out.println(i+" Odd");
			}
			i++;
		}
		
		// do while loop statement
		int k=10;
		do
		{
			System.out.println(k);
		 	k--;
		}while(k>=1);
				
		// for loop statement	
		for (int j=0;j<=10;j++)
		{
			System.out.println(j);
			j++;					// for printing only even numbers
		}
		
		// use of continue statement
        for (int j = 0; j < 10; j++) 
        {
            // If the number is even
            // skip and continue
            if (j % 2 == 0)
                continue;
 
            // If number is odd, print it
            System.out.print(j + " ");
        }  
        
        // reverse number
        // palindrome number
        // count number of digits in a number
        // count number of even and odd digits in a number
        // find sum of digits in a number
	}
}
