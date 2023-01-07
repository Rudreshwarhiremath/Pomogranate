package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityRunner {

	public static void main(String[] args) {
		Map<String, Double> temp = new LinkedHashMap<String, Double>();
		temp.put("Bidar", 22.5);
		temp.put("Kalburgi", 30.5);
		temp.put("Madikeri", 10.2);
		temp.put("Udupi", 15.4);
		temp.put("Tumakur", 22.3);
		temp.put("Shivamogga", 24.2);
		temp.put("Chamarajnagar", 11.2);
		temp.put("Vijaypur", 29.45);
		temp.put("Yadagir", 30.26);
		temp.put("Mangloore", 19.23);

		Set<Entry<String, Double>> entri = temp.entrySet();
		entri.forEach(ele -> System.out.println(ele));
		Collection<Double> value = temp.values();
		value.stream().forEach(ele -> System.out.println(ele));
		Set<String> key = temp.keySet();
		key.forEach(ele -> System.out.println(ele));

	}

}
