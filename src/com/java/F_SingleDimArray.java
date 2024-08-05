package com.java;

/*
 *  Declare an array
 *  add values into array
 *  find size of an array
 *  read single value from an array 
 *  read multiple values from an array
 */
public class F_SingleDimArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[0]=500;
		a[1]=400;
		a[2]=300;
		a[3]=200;
		a[4]=100;
		// or
		int b[]= {100,200,300,400,500};
		
		System.out.println("Leang of an array : "+a.length);
		System.out.println(b[4]);
		System.out.println();
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		System.out.println();
		for(int x:b) 					// enhanced for loop 
		{
			System.out.println(x);
		}
		
	}
}
