package com.qa.swamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Navigation_Input
{
	static int x = 0;
	static int y = 0;
	
	static ArrayList<Integer> location = new ArrayList<Integer>(2);

	
	public static void main(String[] args) 
	{
//		if (location.get(0) == null || location.get(0) == null)
//		{
//			location.add(x);
//			location.add(y);
//		}

		Navigation_Input playerInput = new Navigation_Input();
		
		if (inputIn.input() instanceof Integer) // wrong place???? needs own method
		{
			System.out.println (inputIn); // needs return!!!
		}
		else
		{
			System.out.println("Please pick a Direction");
		}
	}
	// ----------------------------------------------
	public int input()
	//public String input() 
	{
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine ();		

		DistanceCalc calc = new DistanceCalc(location);
		int newlocat = calc.getDistance();

			
			input = input.toUpperCase();

			if(input == "North" || input == "N") 
			{
				// - Just north direction
				x = x;
				y = y++;
				
				Navigation_Input.newlocation(x, y);

				newlocat = calc.getDistance();

				System.out.println("In = " + calc);

			}

		
			return newlocat;
	}
	public static void newlocation(int newX, int newY)
	{
		location.set(0, x);
		location.set(1, y);
	}

}
