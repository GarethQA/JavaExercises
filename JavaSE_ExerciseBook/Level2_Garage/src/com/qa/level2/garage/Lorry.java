package com.qa.level2.garage;

public class Lorry extends Vehicle /* InheritsFrom */
{
	private Boolean container;

	public Lorry(
			/* Inherited Parameters */
			int weight, String size, String damage,

			/* class Specific Parameters */
			boolean container)
	{
		super (weight, size, damage);
		this.container = container;
	}
}