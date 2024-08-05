package com.java.oops.examples;

public class ExEmpMainClassAndObject 
{
	public static void main(String[] args) 
	{
		ExEmpClassAndObject emp1= new ExEmpClassAndObject(); // called from package
		ExEmpClassAndObject emp2= new ExEmpClassAndObject();
		
		emp1.id=101;
		emp1.name="Ravi";
		emp1.job="QA";
		emp1.sal=10000;
		emp1.display();
		System.out.println();
		
		emp2.id=102;
		emp2.name="Mace";
		emp2.job="Dev";
		emp2.sal=15000;
		emp2.display();
	}
}
