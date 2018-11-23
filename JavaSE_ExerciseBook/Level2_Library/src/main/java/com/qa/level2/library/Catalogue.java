package com.qa.level2.library;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

public class Catalogue
{
	private int iDnum = 1;

	Catalogue catalogue = new Catalogue  ();
	Library library = new Library ();

	public void addItem(Object itemObject)
	{
		if (itemObject instanceof Book)
		{
			catalogue.iDnum = ++iDnum;
			library.catalogue.put ("B" + iDnum, itemObject);
		}
//		More instanceof if here for other object types
	}

	public Object getItemByID(String itemID)
	{

		// HashMap<Integer, Object> catalogue = new HashMap<Integer, Object>(); --
		// Reminder

		Optional <Entry <String, Object>> searchResults = library.catalogue.entrySet().stream ().filter(sr -> sr.getKey().equals(itemID)).findFirst ();
		System.out.println (searchResults);
				//library.catalogue.get (itemName);

		return searchResults;
	}
}
