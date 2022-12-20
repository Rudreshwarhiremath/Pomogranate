package com.xworkz.javacollection.boot;

import java.util.Collection;
import java.util.HashSet;

public class BikeRunner {

	public static void main(String[] args) {
		String bike1 = "Suzuki MAXR100";
		String bike2 = "Passion pro";
		String bike3 = "Splender";
		String bike4 = "HF Deluxe";
		String bike5 = "CD 100";
		String bike6 = "Platinum";
		String bike7 = "CT 100";
		String bike8 = "Pulser";
		String bike9 = "Pulser 220";
		String bike10 = "Splender plus";
		String bike11 = "RX-100";
		String bike12 = "R-15";
		String bike13 = "Activa";
		String bike14 = "Shine";
		String bike15 = "Duke";
		String bike16 = "KTM";
		String bike17 = "Bullete";
		String bike18 = "Apachi";

		Collection<String> collection = new HashSet<String>();
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		System.out.println(collection.size());
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		
		System.out.println("Size befor clearing bike-"+collection.size());
		collection.clear();
		System.out.println("Size after clearing bike-"+collection.size());

	}

}
