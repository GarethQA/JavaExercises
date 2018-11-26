package com.qa.level1.arrayiteration1;

public class ArraysIterationPt1
{
	public static void main(String [] args)
	{
		int [] aRay = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < aRay.length; i++ )
		{
			ArraysIterationPt1 calling = new ArraysIterationPt1 ();
			System.out.println (calling.calc (aRay[i] + 3, i * 3, true));
		}
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
