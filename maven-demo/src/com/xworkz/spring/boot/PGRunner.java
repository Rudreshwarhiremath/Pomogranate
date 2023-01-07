package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PGRunner {

	public static void main(String[] args) {
		Map<String, Double> pg = new HashMap<String, Double>();
		pg.put("Sri sai", 5500D);
		pg.put("Pallavi ", 4000D);
		pg.put("SLV ", 5400D);
		pg.put("PKS ", 9000D);
		pg.put("Balaji ", 8500D);
		pg.put("Shree Lakshmi ", 7500D);
		pg.put("Nisrga ", 5000D);
		pg.put("Garden ", 6500D);
		pg.put("Vigneshwar", 4500D);
		pg.put("Baba ", 2500D);
		pg.put("Khushi ", 70000D);
		pg.put("A1 Gold ", 60000D);

		Set<String> keys = pg.keySet();
		System.err.println("Keys");
		keys.forEach(ele -> System.out.println(ele));
		// System.out.println(keys);
		System.out.println(System.lineSeparator());
		System.err.println("Values");
		Collection<Double> values = pg.values();
		values.forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.err.println("Entries");
		Set<Entry<String, Double>> entres = pg.entrySet();
		entres.forEach(ele -> System.out.println(ele));

	}

}
