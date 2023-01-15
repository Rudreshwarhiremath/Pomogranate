package com.xworkz.spring.boot;


import java.util.Map;
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

		runs.forEach((m, n) -> {

			if (n < 10000D) {
			boolean removed=runs.remove(m, n);
			System.out.println(removed);
			}
			System.err.println(m+"--"+n);
		});
		

	}

}
