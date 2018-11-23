package com.qa.level2.library;

public class MainLibrary
{
	public static void main (String[] args) // removes static poisoning
	{
		// add new book
		Book firstLang = new BookManager().title ("Cuneiform").yearPublished (-3400).copies (12).buildBook (); 
												// Cuneiform is the oldest written language known
		Catalogue inLib = new Catalogue ();
		inLib.addItem(firstLang);
		
		LibraryUI libUI = new LibraryUI();
		libUI.userInput();
		
		Library library = new Library();
		library.requestDesk();
	}
}
