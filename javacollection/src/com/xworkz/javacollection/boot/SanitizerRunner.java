package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.xworkz.javacollection.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO sanitizer1 = new SanitizerDTO("Lifebuoy", 90D, "White", 22435119530L);
		SanitizerDTO sanitizer2 = new SanitizerDTO("Dettol", 129D, "Pink", 141L);
		SanitizerDTO sanitizer3 = new SanitizerDTO("Purell", 320D, "Blue", 24289290155L);
		SanitizerDTO sanitizer4 = new SanitizerDTO("BabyGanics", 2300D, "Green", 141L);
		SanitizerDTO sanitizer5 = new SanitizerDTO("Sterillium", 138D, "Pink", 20311872491L);
		SanitizerDTO sanitizer6 = new SanitizerDTO("Himalya", 41D, "Orange", 7281999988L);
		SanitizerDTO sanitizer7 = new SanitizerDTO("Savlon", 50D, "Blue", 22467718548L);
		SanitizerDTO sanitizer8 = new SanitizerDTO("Resist+", 75D, "Sky blue", 141L);
		SanitizerDTO sanitizer9 = new SanitizerDTO("Biotique", 81D, "Red", 23740768230L);
		SanitizerDTO sanitizer10 = new SanitizerDTO("Wellcare", 200D, "Green", 22741467762L);
		SanitizerDTO sanitizer11 = new SanitizerDTO("Cipla", 250D, "White", 22324410430L);
		SanitizerDTO sanitizer12 = new SanitizerDTO("Austro", 111D, "Blue", 1414L);
		SanitizerDTO sanitizer13 = new SanitizerDTO("Klenza", 230D, "White", 5667887L);
		SanitizerDTO sanitizer14 = new SanitizerDTO("Sanitro", 199D, "Red", 79489L);
		SanitizerDTO sanitizer15 = new SanitizerDTO("Oriley", 99D, "Orange", 5434151L);
		SanitizerDTO sanitizer16 = new SanitizerDTO(null, 99D, "Orange", 5434151L);

		Collection<SanitizerDTO> sanitizercollection = new ArrayList<SanitizerDTO>();
		sanitizercollection.add(sanitizer1);
		sanitizercollection.add(sanitizer2);
		sanitizercollection.add(sanitizer3);
		sanitizercollection.add(sanitizer4);
		sanitizercollection.add(sanitizer5);
		sanitizercollection.add(sanitizer6);
		sanitizercollection.add(sanitizer7);
		sanitizercollection.add(sanitizer8);
		sanitizercollection.add(sanitizer9);
		sanitizercollection.add(sanitizer10);
		sanitizercollection.add(sanitizer11);
		sanitizercollection.add(sanitizer12);
		sanitizercollection.add(sanitizer13);
		sanitizercollection.add(sanitizer14);
		sanitizercollection.add(sanitizer15);
		sanitizercollection.add(sanitizer16);

		System.out.println("Size of sanitizer-" + sanitizercollection.size());
		System.out.println(System.lineSeparator());
		System.err.println("Sanitizer price above 150-");
		Iterator<SanitizerDTO> sanitize = sanitizercollection.iterator();
		while (sanitize.hasNext()) {
			SanitizerDTO dto = sanitize.next();
			Double[] b = { dto.getPrice() };
			if (dto.getPrice() > 150D) {
				System.out.println(dto);
			}

		}
		System.out.println(System.lineSeparator());
		System.err.println("Sanitizer price below 150-");
		Iterator<SanitizerDTO> sanitize1 = sanitizercollection.iterator();
		while (sanitize1.hasNext()) {
			SanitizerDTO dto = sanitize1.next();
			if (dto.getPrice() < 150D) {
				System.out.println(dto);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> sanitize2 = sanitizercollection.iterator();
		while (sanitize2.hasNext()) {
			SanitizerDTO dto1 = (SanitizerDTO) sanitize2.next();
			if (dto1.getBrand() == null || dto1.getColor() == null || dto1.getPrice() == 00D || dto1.getId() == 00L) {
				System.err.println(dto1);
			}
		}
		System.out.println(System.lineSeparator());
		Double[] a = { sanitizer1.getPrice(), sanitizer2.getPrice(), sanitizer3.getPrice(), sanitizer4.getPrice(),
				sanitizer5.getPrice(), sanitizer6.getPrice(), sanitizer7.getPrice(), sanitizer8.getPrice(),
				sanitizer9.getPrice(), sanitizer10.getPrice(), sanitizer11.getPrice(), sanitizer12.getPrice(),
				sanitizer13.getPrice(), sanitizer14.getPrice(), sanitizer15.getPrice(), sanitizer16.getPrice() };
		Double c = 00D;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		System.out.println("Price values in desending order");
		for (Double i : a) {
			System.out.println(i);
		}
		System.out.println(System.lineSeparator());
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[0]) {
				System.err.println("Maximum price of sanitizer:--" + a[i]);
			}
			if (a[i] == a[15]) {
				System.err.println("Minimum  price of sanitizer:--" + a[i]);
			}
			if (a[i] == a[1]) {
				System.err.println("Second maximum  price of sanitizer:--" + a[i]);
			}

		}

		System.out.println(System.lineSeparator());
		System.out.println("Size of sanitizer befor remove-" + sanitizercollection.size());
		Iterator<SanitizerDTO> sanitize3 = sanitizercollection.iterator();
		while (sanitize3.hasNext()) {
			SanitizerDTO dto2 = (SanitizerDTO) sanitize3.next();
			if (dto2.getColor() == "Red" || dto2.getColor() == "Green" || dto2.getColor() == "Blue") {
				sanitize3.remove();
			}
		}
		System.out.println("Size of sanitizer after remove-" + sanitizercollection.size());
		System.out.println(System.lineSeparator());

	}

}
