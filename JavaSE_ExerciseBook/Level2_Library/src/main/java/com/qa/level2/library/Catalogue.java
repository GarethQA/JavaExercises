package com.qa.level2.library;

import java.util.HashMap;

public class Catalogue
{
	private HashMap <String, Object> archive = new HashMap <String, Object> ();
	private int iDnum = archive.size ();

	public HashMap <String, Object> accessArchive()
	{
		return this.archive;
	}

	public void addItem(Book itemObject)
	{

		if (itemObject instanceof Book)
		{
			this.iDnum++ ;
			// System.out.println ("iDnum = " + iDnum + "\n");

			this.archive.put ("B" + iDnum, itemObject);
		}
	}

	public void addItem(GovDoc itemObject)
	{

		if (itemObject instanceof GovDoc)
		{
			this.iDnum++ ;
			// System.out.println ("iDnum = " + iDnum + "\n");

			this.archive.put ("GD" + iDnum, itemObject);
		}
	}

	public void removeFromShelves(String itemID)
	{
		this.archive.remove (itemID);
	}

	public Object archiveGet(String itemID)
	{
		Object retrievedItem = this.archive.get (itemID);
		archiveGet (itemID, ((Object) retrievedItem));
		return retrievedItem;
	}

	public void archiveGet(String itemID, String ItemType)
	{
		switch (ItemType)
		{
			case "Book" :
				archiveGet (itemID, new Book ("", 0, 0));
				break;

			case "GovDoc" :
				archiveGet (itemID, new GovDoc ("", 0, 0));
				break;

			default :
		}
	}

	public void archiveGet(String itemID, Object itemType)
	{
		// better way of doing this?
		if (itemType instanceof Book)
		{
			Book retrievedItem = (Book) this.archive.get (itemID);
			String bookTitle = ((Book) retrievedItem).getTitle ();
			Integer bookYearPublished = ((Book) retrievedItem).getYearPublished (),
					bookCopies = ((Book) retrievedItem).getCopies ();

			System.out.println (String.format (
					"Archive Details - %s\n------------------------\n- Book Title: %s\n- Book Year: %s\n- %s: %s\n",
					itemID, bookTitle, (bookYearPublished > 0) ? "AD " + bookYearPublished : -bookYearPublished + " BC",
					(bookCopies == 1) ? "Copy" : "Copies", bookCopies));
		}
		else if (itemType instanceof GovDoc)
		{
			GovDoc retrievedItem = (GovDoc) this.archive.get (itemID);
			String bookTitle = ((GovDoc) retrievedItem).getTitle ();
			Integer bookYearPublished = ((GovDoc) retrievedItem).getYearPublished (),
					bookCopies = ((GovDoc) retrievedItem).getCopies ();

			System.out.println (String.format (
					"Archive Details - %s\n------------------------\n- Book Title: %s\n- Book Year: %s\n- %s: %s\n",
					itemID, bookTitle, (bookYearPublished > 0) ? "AD " + bookYearPublished : -bookYearPublished + " BC",
					(bookCopies == 1) ? "Copy" : "Copies", bookCopies));
		}
		else
		{
			System.out.println ("I am sorry I do not know which item type your referring to\n");
		}
	}

	public void checkOutItem(String itemID)
	{
		// better way of doing this?
		Object retrievedItem = this.archive.get (itemID);

		if (retrievedItem instanceof Book)
		{
			Integer copies = ((Book) retrievedItem).getCopies ();
			if (copies > 0)
			{
				((Book) retrievedItem).setCopies (--copies);
			}
			else
			{
				System.out.println (String.format (
						"I am are sorry for the inconvenience but all copies of \"%s\" are currently on loan\n",
						((Book) retrievedItem).getTitle ()));
			}
		}
		if (retrievedItem instanceof GovDoc)
		{
			Integer copies = ((GovDoc) retrievedItem).getCopies ();
			if (copies > 0)
			{
				((GovDoc) retrievedItem).setCopies (--copies);
			}
			else
			{
				System.out.println (String.format (
						"I am are sorry for the inconvenience but all copies of \"%s\" are currently on loan\n",
						((GovDoc) retrievedItem).getTitle ()));
			}
		}
	}

	public Integer checkInItem(String itemID)
	{
		// better way of doing this?
		int itemCopies = -1; // debug if minus easier to recognise as a bug
		Object retrievedItem = this.archive.get (itemID);

		if (retrievedItem instanceof Book)
		{
			Integer bookCopies = ((Book) retrievedItem).getCopies ();
			((Book) retrievedItem).setCopies (++bookCopies);
			itemCopies = bookCopies; // TDD = must be an increment from previous number of copies
		}
		else if (retrievedItem instanceof GovDoc)
		{
			Integer bookCopies = ((GovDoc) retrievedItem).getCopies ();
			((GovDoc) retrievedItem).setCopies (++bookCopies);
			itemCopies = bookCopies; // TDD = must be an increment from previous number of copies
		}
		
		return itemCopies;
	}
}
