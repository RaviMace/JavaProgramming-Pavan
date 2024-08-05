package com.java.practice;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s = "ravi";
		String r  = "";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			r = r+s.charAt(i); 
		}
		System.out.println("Rev String : "+r);
		System.out.println();
		
		// Char Array
		r="";
		char a[]=s.toCharArray();
		
		for (int i = a.length-1; i>=0; i--) 
		{
			r=r+a[i];
		}
		System.out.println("Rev String : "+r);
		System.out.println();
		
		// String Buffer
		StringBuffer s1=new StringBuffer("Ravi");
		System.out.println("Rev String : "+s1.reverse());
		System.out.println();
		
		// String Builder
		StringBuilder s2=new StringBuilder("RAVI");
		System.out.println("Rev String : "+s2.reverse());
		System.out.println();
		
	}
}
