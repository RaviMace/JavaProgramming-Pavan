package com.java;

public class E_LoopStatements 
{
	public static void main(String[] args) 
	{
	// while loop statement - if you are uncertain about the numbers of iterations and the loop termination based on a condition.
		int a=0;
		while (a<=10)
		{
			System.out.println(a);
			a++;
		}
		
	// do while loop statement - if you want to execute the loop at least once.
		int k=10;
		do
 		{
	 		System.out.println(k);
 			k--;
 		}while(k>=1);
		
	// for loop statement - if you know the number of iterations in advance.
		for (int j=0;j<=10;j++)
	    {
			System.out.println(j);
			j++;					// for printing only even numbers
	    }
		
	// break statements	
		for (int i = 0; i < 10; i++) {
		    if (i == 5) {
		        break;
		    }
		    System.out.println(i);
		}
	
	// continue statement
		for (int j = 0; j < 10; j++) 
        {
            // If the number is even
            // skip and continue
            if (j % 2 == 0)
                continue;
 
            // If number is odd, print it
            System.out.print(j + " ");
        } 
		
		// Beak outerLoop
		outerLoop:
		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (j == 3) {
		            break outerLoop; // Breaks out of the outer loop
		        }
		        System.out.println("i = " + i + ", j = " + j);
		    }
		}

		// continue outerLoop
		outerLoop:
		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (j == 3) {
		            continue outerLoop; // Skips the current iteration of the outer loop
		        }
		        System.out.println("i = " + i + ", j = " + j);
		    }
		}
	}
}
