package com.qa.level2.paintwizard;

public class Paint
{
	private String name;
	private Double totalCoverage;
	private Double wastageAmount;
	private Double pricePerLitre;
	private Double wastageCost  ;

	Paint(String name, Double price, Double litreage, Double coverage)
	{
		this.name 		   = name;
		this.totalCoverage = litreage * coverage;
		this.pricePerLitre = price / litreage;
	}

	public void setWastageAmount(int roomSurfaceArea)
	{
		this.wastageAmount = roomSurfaceArea - totalCoverage;
	}

	public void setWastageCost()
	{
		this.wastageCost   = wastageAmount * pricePerLitre;
	}

	public Double getWastageAmount()
	{
		return wastageAmount;
	}

	public Double getWastageCost()
	{
		return wastageCost;
	}
}