package com.qa.level2.garage;

public class Vehicle
{
	private int		weight;
	private String	size;
	private String	damage;

	// -------------------------
	public Vehicle(int weight, String size, String damage)
	{
		this.weight = weight;
		this.size = size;
		this.damage = damage;
	}

	// -------------------------
	int getWeight()
	{
		return weight;
	}

	// -------------------------
	String getSize()
	{
		return size;
	}

	// -------------------------
	String getDamage()
	{
		return damage;
	}
}