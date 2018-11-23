package com.qa.level1.conditionals2;

/* Modify your method from the previous task to have another if statement
 * that checks if one of the numbers is 0, if this is true then return the
 * other non-0 number. */

public class ConditionalsPt2
{
	public static void main(String [] args)
	{
		ConditionalsPt2 calling = new ConditionalsPt2 ();
		System.out.println (calling.calc (3, 3, true));
		System.out.println (calling.calc (3, 3, false));
		System.out.println (calling.calc (0, 3, false));
		System.out.println (calling.calc (4, 0, false));

	}

	int calc(int x, int y, boolean z)
	{
		int w;
		if (x != 0 && y != 0)
		{
			if (z) // default value is true
			{
				w = x + y;
			}
			else // opposite is false
			{
				w = x * y;
			}
		}
		else if (x == 0)
		{
			w = y;
		}
		else
		{
			w = x;
		}

		return w;
	}
}