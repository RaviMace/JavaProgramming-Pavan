package com.java;

public class D_ConditionalStatementProgram 
{
	public static void main(String[] args) 
	{
		int i = 10;
		 	
		//if Conditional Statement
        if (i < 15)
        {    
        	System.out.println("Inside If block"); // part of if block(immediate one statement after if condition)
            System.out.println("10 is less than 15"); //always executes as it is outside of if block
        // This statement will be executed
        // as if considers one statement by default again below statement is outside of if block
        }    
        System.out.println("I am Not in if");
        
        // if else Conditional statement
        if (i < 15)
        {
        	System.out.println("Inside If block");
            System.out.println("i is smaller than 15");
        }
        else
        {
        	System.out.println("Inside else block");
            System.out.println("i is greater than 15");
        }
        
        // nested if conditional statement
        if (i == 10 || i<15) 
        {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
 
            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println("i is smaller than 12 too");
        } 
        else
        {
                System.out.println("i is greater than 15");
        }
        
        //if ladder conditional statement
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
        
        // switch conditional statement
        //String j = "d"; 
        switch(i)
        {
          case 5 :  System.out.println("It is 5");
                    break;
          case 10 : System.out.println("It is 10");
                    break;
          case 15 : System.out.println("It is 15");
                    break;
          case 20 : System.out.println("It is 20");
                    break;
          default:  System.out.println("Not present");
             
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
        
        // use of return statement
        boolean t = true;
        System.out.println("Before the return.");
 
        if (t)
            return;
 
        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute."); 
	}

}
