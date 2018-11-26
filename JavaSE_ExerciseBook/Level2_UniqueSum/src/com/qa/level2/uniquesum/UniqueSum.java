package com.qa.level2.uniquesum;

/* Given 3 integer values, return their sum. If one value is the same as another value,
 * they do not count towards the sum. Aka only return the sum of unique numbers given.
*/

public class UniqueSum
{
	public static void main (String[] args)
	{
		int num1 = 3, num2 = 3, num3 = 3;

		UniqueSum uSum = new UniqueSum();
		
		System.out.println("Sum = " + uSum.calc (num1, num2, num3));
	}
	
	public int calc(int num1, int num2, int num3)
	{
		int sum;

		if (num1 == num2 && !(num1 == num3))
		{
			sum = num3;
		}
		if (num1 == num3 && !(num1 == num2))
		{
			sum = num2;
		}
		if (num2 == num3 && !(num1 == num2))
		{
			sum = num1;
		}
		if (!(num1 == num2) && !(num1 == num3) && !(num2 == num3))
		{
			sum = num1 + num2 + num3;
		}
		else
		{
			sum = 0;
		}
		
		return sum;
	}
}
