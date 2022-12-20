package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class SweetRunner {

	public static void main(String[] args) {
		String sweet1 = "Jamun";
		String sweet2 = "Mysore pak";
		String sweet3 = "Dharvada Pead";
		String sweet4 = "Kunda";
		String sweet5 = "Laddu";
		String sweet6 = "Jalebi";
		String sweet7 = "Balusha";
		String sweet8 = "Burfi";
		String sweet9 = "Kalakan";
		String sweet10 = "Dhuda Peda";
		String sweet11 = "Rasagulla";
		String sweet12 = "SonaPapadi";
		String sweet13 = "Chikki";

		Collection<String> collection = new ArrayList<String>();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		System.out.println("size before clearing-" + collection.size());
		collection.clear();
		System.out.println("Size after clearing-" + collection.size());

	}

}
