package com.java;

/*
 *  Declare an array
 *  add values into array
 *  find size of an array
 *  read single value from an array 
 *  read multiple values from an array
 */
public class F_TwoDimArray 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][2];
		a[0][0]=600;
		a[0][1]=500;
		a[1][0]=400;
		a[1][1]=300;
		a[2][0]=200;
		a[2][1]=100;
		// or
		int b[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("Leang of an array : "+a.length);
		System.out.println(b[2][1]);
		System.out.println();
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}
		System.out.println();
		for(int x[]:b) 					// enhanced for loop 
		{
			for(int y:x) 
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
	}
}
