package com.qa.level1.arrayiteration2;

/* Create a for loop that populates an integer array with values, 
 * outputting them at each iteration. Then create another loop that 
 * iterates through the array, changing the values at each point to 
 * equal itself times 10, outputting them at each iteration.
*/

public class ArraysIterationPt2
{
	public static void main(String [] args)
	{
		int aVal = 10;
		int [] aRay = new int [aVal];

		for (int i = 0; i < aVal; i++ )
		{
			aRay[i] = i + 1;
		}
		for (int i = 0; i < aRay.length; i++ )
		{
			aRay[i] = aRay[i] * 10;
			System.out.println (aRay[i]);
		}
	}
}
