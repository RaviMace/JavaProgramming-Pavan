package com.java.practice;

public class ConditionalStatement {

	 public static void main(String[] args) 
	{
		int i = 10;
		 if (i%2==0) // "%" will return the reminder  
		 {   
			 System.out.println("i is even number");
	        
		 } 
		 else
		 {
	        System.out.println("i is odd number");   
		 }
		 
		 // nested if
		 if (i == 10 || i<15) 
	     {
	         if (i < 15)
	                System.out.println("i is smaller than 15");
	 
	         if (i < 12)
	                System.out.println("i is smaller than 12 too");
	     } 
	     else
	     {
	         System.out.println("i is greater than 15");
	     }
		 
		String j = "d"; 
	        switch(j)
	        {
	          case "a" :  System.out.println("It is a");
	                    break;
	          case "b" : System.out.println("It is b");
	                    break;
	          case "c" : System.out.println("It is c");
	                    break;
	          case "d" : System.out.println("It is d");
	                    break;
	          default:  System.out.println("Not present");
	        }     
		 
	}

}
