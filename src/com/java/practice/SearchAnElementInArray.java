package com.java.practice;

public class SearchAnElementInArray 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int se = 30;
		boolean s=false;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==se) 
			{
				System.out.println("For Loop : "+"Single Element found");
				s=true;
				break;
			}
		}
		
		if (s==false)
			System.out.println("For Loop : "+"Single Element not found");
		
		// enhanced for loop
		for(int x:a) 
		{
			if(x==se) 
			{
				System.out.println("Enhanced For Loop : "+"Single Element found");
				s=true;
				break;
			}
		}
		
		if (s==false) 
		{
			System.out.println("Enhanced For Loop : "+"Single Element not found");
		}
	}
}
