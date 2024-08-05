 package com.java;

import java.util.Scanner;

public class G_TakingInputFromKeyboard 
{
	//@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		// Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
        // /*
        System.out.println("Enter the Values");

        // String input
        String name = sc.nextLine(); // also sc.next() can be used
 
        // Character input
        char gender = sc.next().charAt(0);
 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
 
        // Print the values to check if the input was
        // correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
        // */
        
        ///*
        // Take the array size from the user
        System.out.print("Enter the size of the array: ");
        int arr_size = sc.nextInt();
 
        // Initialize the array's
        // size using user input
        int[] arr = new int[arr_size];
 
        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        
        for (int i = 0; i < arr_size; i++) 
        {
            if (sc.hasNextInt()) 
            {
                arr[i] = sc.nextInt();
            }
        }
 
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr_size; i++) 
        {
            // prints the elements of an array
            System.out.print(arr[i] + " ");
        }
        sc.close(); //*/       
	}
}
