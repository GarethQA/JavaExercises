package com.qa.level2.paintwizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RoomSize
{
	public static void main (String [] args)
	{
								   // Paint (name, price, litreage, coverage)
		Paint cheapoMax 		= new Paint ("CheapoMax", 19.99, 20.00, 10.00);
		Paint averageJoes 		= new Paint ("AverageJoes", 17.99, 15.00, 11.00);
		Paint duluxourousPaints = new Paint ("DuluxourousPaints", 25.00, 10.00, 20.00);

		ArrayList <Object> choiceOfPaint = new ArrayList <Object> ();
		choiceOfPaint.add(cheapoMax);
		choiceOfPaint.add(averageJoes);
		choiceOfPaint.add(duluxourousPaints);

		System.out.println("Enter Your Room Size: ");
		Scanner scanner = new Scanner(System.in);
		String roomSurfaceArea = scanner.nextLine();
		
		for()
		{
			choiceOfPaint.setWastageAmount;
			choiceOfPaint.setWastageCost;
		}

		List <Object> choiceOfPaint.stream.filter(s -> s.getWastageCost().min()).collect(Collectors.toList());

		System.out.println(choiceOfPaint);
	}
}