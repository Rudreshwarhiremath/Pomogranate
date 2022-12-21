package com.xworkz.javacollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {
		String animal1 = "Lion ";
		String animal2 = "Tiger ";
		String animal3 = "Cat ";
		String animal4 = "Dog ";
		String animal5 = "Cow ";
		String animal6 = "oxe ";
		String animal7 = "Mouse";
		String animal8 = "Fox";
		String animal9 = "Lipord";
		String animal10 = "Python";

		Collection<String> collection = new ArrayList<String>();
		collection.add(animal1);
		collection.add(animal2);
		collection.add(animal3);
		collection.add(animal4);
		collection.add(animal5);
		collection.add(animal6);
		collection.add(animal7);
		collection.add(animal8);
		collection.add(animal9);
		collection.add(animal10);

		System.out.println(collection);
		System.out.println("===========to string==========");

		for (String element : collection) {
			System.out.println(element);
		}
		System.out.println("=========== for each==========");
		Iterator<String> value = collection.iterator();
		while (value.hasNext()) {
			String reference = value.next();
			System.out.println(reference);
		}
		System.out.println("=========== iterator==========");

	}

}
