package com.qa.level2.people;

import java.awt.List;
import java.util.ArrayList;

public class People /*Runner*/
{
	public static void main (String [] args)
	{
		/*		
		Person person_0 = new Person(Name 	 	= String
					     			 Age 		= int
					     			 Job Title = String)
					     			 */
		Person person_1 = new Person("gef",
									  44,
									 "executive"); 

		Person person_2 = new Person("BOB",  
									 20,
									 "Army soldier"); 

		Person person_3 = new Person("teRry",
									 29,
									 "Pro-Golfer"); 

		Person person_4 = new Person("SUSAN",	  
									 56,
									 "Doctor");

		Person person_5 = new Person("Hihi", 
									 35,
									 "Security Officer");

		People.Print(person_2.getDetails());
	}

	public static void Print(Object printThis)
	{
		// for (int i = 0; i < list_of_People.size(); i++)
		// {
		// 	System.out.println("ID:" + i + " => " + list_of_People.get(i));
		// }

		System.out.println("ID:" + " " + " => " + printThis);
	}
}