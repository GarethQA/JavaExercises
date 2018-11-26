package com.qa.level2.library;

public class Library
{

	public void requestDesk()
	{
		// add new book
		Book firstLang = new BookManager ().title ("Cuneiform").yearPublished (-3400).copies (1).buildBook ();
		// Cuneiform is the oldest known written language
		
		GovDoc Snoopers = new GovDocManager ().title ("Snooper's Charter").yearPublished (2016).copies (1).buildGovDoc ();

		Catalogue catalogue = new Catalogue ();
		catalogue.addItem (firstLang);
		catalogue.addItem (Snoopers);
		
		try
		{
			catalogue.archiveGet ("B1", String.format ("%s", "Book" /*for futureVar from command line*/));
			catalogue.checkOutItem ("B1");	
			catalogue.archiveGet ("B1", String.format ("%s", "Book")); // Manual TEST = 
			catalogue.checkOutItem ("B1");	
			catalogue.archiveGet ("B1", String.format ("%s", "FakeCall"));
			catalogue.checkInItem ("B1");	
			catalogue.archiveGet ("B1", String.format ("%s", "Book"));
			catalogue.checkInItem ("B1");	
			catalogue.checkInItem ("B1");	
			catalogue.archiveGet ("B1", String.format ("%s", "Book"));

			catalogue.archiveGet ("GD2", String.format ("%s", "GovDoc" /*for futureVar from command line*/));
			catalogue.checkOutItem ("GD2");	
			catalogue.archiveGet ("GD2", String.format ("%s", "GovDoc")); // Manual TEST = 
			catalogue.checkOutItem ("GD2");	
			catalogue.archiveGet ("GD2", String.format ("%s", "FakeCall"));
			catalogue.checkInItem ("GD2");	
			catalogue.archiveGet ("GD2", String.format ("%s", "GovDoc"));
			catalogue.checkInItem ("GD2");	
			catalogue.checkInItem ("GD2");	
			catalogue.archiveGet ("GD2", String.format ("%s", "GovDoc"));

		}
		catch (NullPointerException exception)
		{
			System.out.println ("No Item Found\n");
		}

	}
}
