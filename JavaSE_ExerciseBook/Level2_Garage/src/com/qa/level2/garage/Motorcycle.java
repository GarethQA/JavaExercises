package com.qa.level2.garage;

public class Motorcycle extends Vehicle /* InheritsFrom */
{
	private String model;

	public Motorcycle(
			/* Inherited Parameters */
			int weight, String size, String damage,

			/* class Specific Parameters */
			String model)
	{
		super (weight, size, damage);
		this.model = model;
	}
}