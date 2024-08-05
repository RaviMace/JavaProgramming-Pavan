package com.java.oops.examples;

class ExEmpMethods
{
	int sid;
	String sname;
	char grad;
	
	void display() 
	{
		System.out.println(sid+"   "+sname+"   "+grad);
	}
	
	void setSData(int id, String name, char g) 
	{
		sid=id;
		sname=name;
		grad=g;
	}
}
