package com.qa.level1.returntypes;

// Create a method to return “Hello World!” once called, which you call 
// from your main method, to then output the text to the screen.

public class ReturnTypes
{
	public static void main (String [] args)	
	{
		String hi = "Hello World!";
		sayThis(hi);
	}
	public static void sayThis (String whatToSay)	
	{
		System.out.println (whatToSay);
	}
}