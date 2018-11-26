package com.qa.level2.library;

public class GovDocManager
{
	private String title;
	private int yearPublished;
	private int copies;

	GovDocManager()
	{

	}

	GovDocManager title(String title)
	{
		this.title = title;
		return this;
	}

	GovDocManager yearPublished(int yearPublished)
	{
		this.yearPublished = yearPublished;
		return this;
	}

	GovDocManager copies(int copies)
	{
		this.copies = copies;
		return this;
	}

	GovDoc buildGovDoc()
	{
		return new GovDoc (title, yearPublished, copies);
	}
}
