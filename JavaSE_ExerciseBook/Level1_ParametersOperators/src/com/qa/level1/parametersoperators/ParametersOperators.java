package com.qa.level1.parametersoperators;

// Create a method that accepts two integers as parameters, then returns an 
// integer that is a sum of the two integers given, then call this method 
// from your main method and output the returned result.

public class ParametersOperators
{
	public static void main(String [] args)
	{
		ParametersOperators calling = new ParametersOperators();
		System.out.println (calling.calc (1, 2));
	}

	int calc(int x, int y)
	{
		int w = x + y;
		return w;
	}

}