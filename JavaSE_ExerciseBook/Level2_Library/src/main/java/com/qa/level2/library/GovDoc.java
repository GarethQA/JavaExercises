package com.qa.level2.library;

public class GovDoc
{
	private String title;
	private int yearPublished;
	private int copies;
	
	GovDoc(String title, int yearPublished, int copies)
	{
		this.title = title;
		this.yearPublished = yearPublished;
		this.copies = copies;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setTitle(int yearPublished)
	{
		this.yearPublished = yearPublished;
	}
	
	public void setCopies(int copies)
	{
		this.copies = copies;
	}
		
	public String getTitle()
	{
		return this.title;
	}
	
	public int getYearPublished()
	{
		return this.yearPublished;
	}
	
	public int getCopies()
	{
		return this.copies;
	}
}
