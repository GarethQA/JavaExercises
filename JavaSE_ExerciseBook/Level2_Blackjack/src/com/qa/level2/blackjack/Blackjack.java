package com.qa.level2.blackjack;

/* Given 2 integer values greater than 0, return whichever value is closest
 * to 21 without going over 21. If they both go over 21 then return 0
*/

public class Blackjack
{
	public static void main(String [] args)
	{
		int num1;
		int num2;
		
		Blackjack whoWon = new Blackjack ();

		num1 = 30;
		num2 = 40;
		System.out.println (whoWon.play (num1, num2));
		
		num1 = 30;
		num2 = 30;
		System.out.println (whoWon.play (num1, num2));
		
		num1 = 21;
		num2 = 21;
		System.out.println (whoWon.play (num1, num2));
		
		num1 = 10;
		num2 = 10;
		System.out.println (whoWon.play (num1, num2));
		
		num1 = 21;
		num2 = 10;
		System.out.println (whoWon.play (num1, num2));
		
		num1 = 10;
		num2 = 21;
		System.out.println (whoWon.play (num1, num2));
		
		num1 = 19;
		num2 = 10;
		System.out.println (whoWon.play (num1, num2));
		
		num1 = 10;
		num2 = 15;
		System.out.println (whoWon.play (num1, num2));
	}

	public String play(int num1, int num2)
	{
		String winner = "";

		if (!(num1 > 21 && num2 > 21)) // Both are NOT more then 21
		{
			if (!(num1 == num2)) // Both NOT the same 
			{
				if ((21 - num1) < (21 - num2)) // if num1 is nearer 21
				{
					winner = "num1 = " + num1;
				}
				else
				{
					winner = "num2 = " + num2;
				}
			}
			else
			{
				winner = "Draw";
			}
		}
		else
		{
			winner = "0";
		}
		
		return winner;
	}
}
