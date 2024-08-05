package com.java.oops;

import java.io.*;

// ExceptionHandeling
// 1) try and catch block
// 2) finally with try and catch block
// 3) throw: Used to explicitly throw an exception.
// 4) throws: Indicates that a method can throw an exception.

public class R_ExceptionHandeling 
{
	 // Method to demonstrate checked exceptions
    public static void readFile(String fileName) throws IOException, FileNotFoundException 
    {
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            System.out.println("First line of the file: " + line);
        } 
	        catch (FileNotFoundException e) 
	        {
	            System.out.println("FileNotFoundException caught: " + e.getMessage());
	            throw e;
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("IOException caught: " + e.getMessage());
	            throw e;
	        } 
		        finally  
		        {
		            if (br != null) 
		            {
		                try 
		                {
		                    br.close();
		                } 
			                catch (IOException e) 
			                {
			                    System.out.println("Error closing BufferedReader: " + e.getMessage());
			                }
		            }
		            System.out.println("Finally block executed for readFile");
		        }
    }

    // Method to demonstrate ClassNotFoundException
    public static void loadClass(String className) throws ClassNotFoundException 
    {
        try 
        {
            Class.forName(className);
        } 
	        catch (ClassNotFoundException e) 
	        {
	            System.out.println("ClassNotFoundException caught: " + e.getMessage());
	            throw e;
	        }
    }

    // Main method 
    @SuppressWarnings({ "unused", "removal", "null" })
	public static void main(String[] args) throws InterruptedException 
    {
    	System.out.println("Program Starts");
    	System.out.println("Checked Exception Starts");
    	System.out.println();
        
    	// Checked exceptions
        try 
        {
            readFile("example.txt");
        } 
	        catch (IOException e) 
	        {
	            System.out.println("Exception caught in main for readFile: " + e.getMessage());
	        }
        System.out.println();
        try 
        {
            loadClass("com.example.NonExistentClass");
        } 
	        catch (ClassNotFoundException e) 
	        {
	            System.out.println("Exception caught in main for loadClass: " + e.getMessage());
	        }

        System.out.println("Checked Exception Ends");
        System.out.println();
        Thread.sleep(5000);
        System.out.println("Unchecked Exception Starts");
        System.out.println();
        
        // Unchecked exceptions
        try 
        {
            int result = 10 / 0; // ArithmeticException
        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println("ArithmeticException caught: " + e.getMessage());
	        }

        try 
        {
            int[] array = new int[5];
            int element = array[10]; // ArrayIndexOutOfBoundsException
        } 
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        }

        try 
        {
            String str = null;
            str.length(); // NullPointerException
        } 
	        catch (NullPointerException e) 
	        {
	            System.out.println("NullPointerException caught: " + e.getMessage());
	        }

        try 
        {
            Object obj = new Integer(100);
            String str = (String) obj; // ClassCastException
        } 
	        catch (ClassCastException e) 
	        {
	            System.out.println("ClassCastException caught: " + e.getMessage());
	        }

        try 
        {
            int num = Integer.parseInt("abc"); // NumberFormatException
        } 
	        catch (NumberFormatException e) 
	        {
	            System.out.println("NumberFormatException caught: " + e.getMessage());
	        }

        try 
        {
            Thread.sleep(-100); // IllegalArgumentException
        } 
	        catch (IllegalArgumentException e) 
	        {
	            System.out.println("IllegalArgumentException caught: " + e.getMessage());
	        } 
	        catch (InterruptedException e) 
	        {
	            System.out.println("InterruptedException caught: " + e.getMessage());
	        }
    }
}



