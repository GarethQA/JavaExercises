package com.qa.level2.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage
{
	public static void main(String [] args)
	{
		/*
		 * Vehicle id_0 = new Car( int weight, String size, String damage, boolean
		 * sports,, String make);
		 */
		Vehicle id_1 = (Vehicle) new Car (877, "Medium", "Minor", true, "Ford");
		Vehicle id_2 = (Vehicle) new Car (900, "Large", "Moderate", false, "Kia");
		Vehicle id_3 = (Vehicle) new Motorcycle (256, "Small", "Major", "Hildebrand & Wolfmuller");
		Vehicle id_4 = (Vehicle) new Motorcycle (256, "Small", "Major", "Suzuki");
		Vehicle id_5 = (Vehicle) new Lorry (4000, "Large", "Minor", true);
		Vehicle id_6 = (Vehicle) new Lorry (4000, "Large", "Minor", false);
		// _________________________
		ArrayList <Vehicle> repairList = new ArrayList <Vehicle> ();

		repairList.add (id_1);
		repairList.add (id_2);
		repairList.add (id_3);
		repairList.add (id_4);
		repairList.add (id_5);
		repairList.add (id_6);

		List <Vehicle> customer = repairList.stream ().collect (Collectors.toList ());

		System.out.println (customer);
	}
}