package com.qa.level2.library;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Modifier;

	public class TestingTheLibrary
	{
		@Test
		// At least one Abstract Class must be implemented.
		public void testAbstract()
		{
			//LibraryProperty library = new LibraryProperty();
			//Class<?> abClass = LibraryProperty;
			//int abClass = Book.getSuperclass().getModifiers();
			int modis = abClass.getModifiers();
			Boolean bool = Modifier.isAbstract(modis); // true if Abstract else false
			assertEquals ("Abstract Class", true, bool);
		}

		/*		
		@Test
		// At least one Interface Class must be implemented.
		public void testInterface()
		{
			TheLibraryInterface library = new TheLibraryInterface()
			Boolean bool = Modifier.isInterface(library.getModifiers()); // true if Interface else false
			assertEquals ("Interface Class", true, bool)
		}
		*/

		// @Test
		// Each item should have at least 1 additional attributes unique to itself.
		// ??? class.getDeclaredField()
		// ??? List and compare, if unshared found then not false (true)

		// @Test
		// 


	}