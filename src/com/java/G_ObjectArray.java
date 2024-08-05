package com.java;

public class G_ObjectArray 
{
	public static void main(String[] args) 
	{
		Object a[] = {100,10.5,'A',"Hello",true};
		Object b[] = {200,20.5,'Z',"Bye",false};
		
		for (Object x :a) 
		{
			System.out.println(x);
		}
		
		System.out.println();
		
		for(int i=0;i<b.length-1;i++) 
		{
			System.out.println(b[i]);
		}
		
	}

}
