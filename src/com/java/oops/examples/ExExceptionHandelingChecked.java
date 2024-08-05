package com.java.oops.examples;

/*
 * we can try below program like this
 * try {
 * 	try{
 * 	} catch{
 * 	}try {
 * 	}...
 * } catch {
 * }
 * 
 * (or)
 * 
 * try {
 * } catch {
 * } catch {
 * }..... so on 
 * 
 * (or)
 * 
 * just 
 * try{
 * }catch (Exception e) {
 * }
 *  
 *  Exception is parent class of all the exceptions
 */

//finally block
/*	case1: Exception occurred, catch block handled -> finally block will execute
 * 	case2: Exception occurred, catch block not handled -> finally block will execute
 * 	case3: Exception does not occurred, catch block ignored -> finally block will execute
 */

public class ExExceptionHandelingChecked 
{
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int a=10;
		int b[]= {100,200,10,210};
		String s1=null;
		String s2=null; // for finally block
		
		System.out.println("Program Start");
		
		try 
		{
			String s="Welcome";
			
			try 
			{
				System.out.println(a/2);
			} 
			catch (ArithmeticException e1) 
			{
				System.out.println(e1);
			}
				finally 
				{
					System.out.println("Exception not occurred, catch block ignored - finally block executed");
				}
			try 
			{
				System.out.println(b[8]);
			} 
			catch (ArrayIndexOutOfBoundsException e2) 
			{
				System.out.println(e2);
			}
				finally 
				{
					System.out.println("Exception occurred, catch block handled - finally block executed");
				}
			try 
			{
				System.out.println(s1.charAt(2));
			} 
			catch (NullPointerException e3) 
			{
				System.out.println(e3);
			}
			try 
			{
				int n=Integer.parseInt(s);
				System.out.println(n);
			} 
			catch (NumberFormatException e3) 
			{
				System.out.println(e3);
			}

			System.out.println(s2.charAt(2));
		} 
		catch (NumberFormatException e) 
		{
			System.out.println(e);
		}
			finally 
			{
				System.out.println("Exception occurred, catch block not handled - finally block executed");
				System.out.println("Program End");
			}
		
		System.out.println("Program End");	// if last catch block handled this print statement will execute	
	}
}
