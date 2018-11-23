package com.qa.level2.people;

public class Person /*Constructor <-> Object Template*/
{
	private String 	name;
	private int 	age;
	private String 	job;
	private String 	getDetails;
	//private 

	public Person(String name, int age, String job) 
	{
		this.name 	= name;
		this.job  	= job;
		this.age  	= age;
		
		/* START --------------------------------------------------------------------------------*/
		getDetails 	= 		"Job = " 
						+ 	this.name.substring(0,1) /*First Letter*/ 	.toUpperCase() 
						+ 	this.name.substring(1)	 /*Rest of String*/ .toLowerCase() 
						+ 	"," 
						+ 	System.lineSeparator() 
						+ 	"        " 

						+ 	"Age = " 
						+ 	this.age 
						+  	"," 
					   	+ 	System.lineSeparator() 
					   	+ 	"        " 

					   	+ 	"Job = " 
					   	+ 	this.job.substring(0,1)	/*First Letter*/ 	.toUpperCase() 
					   	+	this.job.substring(1)	/*Rest of String*/ 	.toLowerCase() 
					   	+  	System.lineSeparator(); 
		/* END ----------------------------------------------------------------------------------*/


	}

	public String getDetails()
	{
		return this.getDetails;
	}

	public String getSearch(String name)
	{
		return name;
	}
}
