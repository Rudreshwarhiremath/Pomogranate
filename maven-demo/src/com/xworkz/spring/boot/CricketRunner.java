package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CricketRunner {

	public static void main(String[] args) {
		Map<String, Double> runs = new TreeMap<String, Double>((a, b) -> b.compareTo(a));
		runs.put("Virat Kohli", 24881D);
		runs.put("Surya kumar yadav", 1966D);
		runs.put("Shreyas ayyer", 3298D);
		runs.put("Rohit", 16586D);
		runs.put("K L Rahul", 15456D);

		runs.forEach((x, y) -> System.out.println(x + "--" + y));

		Set<Entry<String, Double>> entry = runs.entrySet();
		Iterator<Entry<String, Double>> itr = entry.iterator();
		while (itr.hasNext()) {
			Entry<String, Double> ent = itr.next();

			if (ent.getValue() > 10000) {
				itr.remove();
			}
		}
		runs.forEach((x, y) -> System.err.println(x + "--" + y));


	}

}
