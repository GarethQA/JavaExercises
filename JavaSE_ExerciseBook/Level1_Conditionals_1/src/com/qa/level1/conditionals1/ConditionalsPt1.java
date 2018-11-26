package com.qa.level1.conditionals1;

/* Modify your method from the previous task to accept another parameter,
 a Boolean, which if it is true, the method will return a sum of the two 
 numbers, and if it is false it will return the multiplication of the two 
 numbers. */

public class ConditionalsPt1
{
	public static void main(String [] args)
	{
		ConditionalsPt1 calling = new ConditionalsPt1 ();
		System.out.println (calling.calc (3, 3, true));
		System.out.println (calling.calc (3, 3, false));
	}

	int calc(int x, int y, boolean z)
	{
		int w;

		if (z) // default value is true
		{
			w = x + y;
		}
		else // opposite is false
		{
			w = x * y;
		}

		return w;
	}
}