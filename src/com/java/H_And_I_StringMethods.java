package com.java;

public class H_And_I_StringMethods 
{
	public static void main(String[] args) 
	{
		String sd = "Welcome";
		String sa = new String(" Home");
		System.out.println(sd+sa);	
		
		String s= "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());
        System.out.println();

        // Returns the character at nth index.
        // Index will always starts from 0
        System.out.println("Character at 3rd position = " + s.charAt(3));
        System.out.println();

        // Concatenates string2 to the end of string1.
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("Concatenated string  = " + s1.concat(s2));
        System.out.println();

        // Trimming the word
        String word4 = "   Learn Share Learn    ";
        System.out.println("Before Trimming "+word4.length());
        System.out.println("Trim the word " + word4.trim().length()); // will trim the extra spaces on the right and left side.
        System.out.println();

        // Comparing whether the word contains in that word/sentence
        String c1="geeksforgeeks";
        String c2="geeks";
        System.out.println(c1.contains(c2)); // return true
        System.out.println();

        // Checking equality of Strings 
        String com1 = "welcome";
        String com2 = new String ("welcome");
        String com3 = new String ("Welcome");
        String com4 = com2;
        
        System.out.println("Equality without ignoring case sens : "+com1.equals(com2)); // true, because it compares the values of objects
        System.out.println("Equality with ignoring case sens : "+com1.equalsIgnoreCase(com3));
        System.out.println("Comparing objects and values : "+(com1==com2)); // false, because it compares the objects
        System.out.println("Comparing both objects : "+(com2==com4)); //true, because objects are same
        
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);

        Boolean out1 = "Geeks".equalsIgnoreCase("gEeks");
        System.out.println("Checking Equality   " + out1);
        System.out.println();

        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);
        System.out.println();
        
        // Return the substring from the nth  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5)); // it will count from 0-1 remove 1st 2-letters & from 0-4 remove other letters out
        System.out.println();

        // Converting cases
        String word1 = "GeeKyMe";
        System.out.println("Changing to lower Case : " + word1.toLowerCase());
        System.out.println();

        // Converting cases
        String word2 = "GeekyME";
        System.out.println("Changing to UPPER Case : " + word2.toUpperCase());
        System.out.println();

        // Splitting the string
        String s5 = "ravi@gmail.com";
        String a[]=s5.split("@");
        System.out.println("Right side of the String : "+a[0]);
        System.out.println("Left side of the String : "+a[1]);
        System.out.println();
        
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s4.indexOf('a',3));
        System.out.println();

        //If ASCII difference is zero then the two strings are similar
        int ascii = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+ascii);
        System.out.println();
        
        // Char Array
     	String st="Ravi";
        String re="";
     	char c[]=st.toCharArray(); 
     		
     	for (int k=c.length-1; k>=0; k--) 
     	{
     		re=re+c[k];
     	}
     	System.out.println("Rev String : "+re);
     	System.out.println();
     		
     	// String Buffer
     	StringBuffer st1=new StringBuffer("Ravi");
     	System.out.println("Rev String : "+st1.reverse());
     	System.out.println();
     		
     	// String Builder
     	StringBuilder st2=new StringBuilder("RAVI");
     	System.out.println("Rev String : "+st2.reverse());
     	System.out.println(); 
        
 	}

}
