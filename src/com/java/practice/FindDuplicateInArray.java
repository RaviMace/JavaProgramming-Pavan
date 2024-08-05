package com.java.practice;

public class FindDuplicateInArray 
{
	public static void main(String[] args) 
	{
		int a[] = {100,200,100,200,100,300,100,300};
		int n=100;
		int count=0;
		
		for (int v:a) 
		{
			//int n=v;
			if(v==n) 
			{
				count++;
			}
			//System.out.println(n+" has "+count+" Duplicate");
		}
		System.out.println(n+" has "+count+" Duplicate");
	}

}
