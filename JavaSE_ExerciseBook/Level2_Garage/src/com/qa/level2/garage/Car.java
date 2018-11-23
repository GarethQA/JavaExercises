package com.qa.level2.garage;

public class Car extends Vehicle /* InheritsFrom */
{
	private Boolean	sports;
	private String	make;

	public Car(
			/* Inherited Parameters */
			int weight, String size, String damage,

			/* class Specific Parameters */
			boolean sports, String make)
	{
		super (weight, size, damage);
		this.sports = sports;
		this.make = make;
	}
}