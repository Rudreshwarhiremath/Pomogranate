package com.xworkz.spring.boot;

import java.util.Map;
import java.util.TreeMap;

public class PresidentRunner {
	public static void main(String[] args) {
		Map<String, String> president = new TreeMap<String, String>();
		president.put("Bharath", "Drupadi Murma");
		president.put("Srilanka", "Ranil wickremesinghe ");
		president.put("Maleshiya", "Mahathir Mohamad ");
		president.put("Nepal", "Bidhya Devi Bhandari ");
		president.put("Singapur", "Halimah Yacob ");
		president.put("Japan", "Fumio Kishida ");
		president.put("Isreal", "Isaac Herzog ");
		president.put("Thailand", "Prayuth Chan-ocha ");
		president.put("United states", "Joe Biden ");
		president.put("Britan", "Rishi Sunak ");
		president.put("Rassia", "Vladimir Putin ");
		president.put("Germany", "Frank-Walter Steinmeier ");
		president.put("France", "Emmanuel Macron");
		president.put("South africa", "Cyril Ramaphosa ");
		president.put("West Indies", "Ricky Skerritt ");
		president.put("Austrilia", "Anthony albanese");

		president.forEach((a, b) -> System.out.println(a + ">>>>" + b));
		System.out.println("=======================");
		president.forEach((key, value) -> {
			if (key.length() >= 10) {
				president.replace(key, "Santhosh");
				System.err.println(key + "=====" + value);
			} else {
				// System.out.println(key + "=====" + value);
			}
		});
		System.out.println("updated values");
		president.forEach((key, value) -> System.out.println(key + "--" + value));
		


	}

}
