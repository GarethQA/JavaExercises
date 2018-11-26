package com.qa.level2.library;

public class MainLibrary
{
	public static void main(String [] args) 
	{
		Library library = new Library ();
		library.requestDesk (); // removes static poisoning
	}
}
