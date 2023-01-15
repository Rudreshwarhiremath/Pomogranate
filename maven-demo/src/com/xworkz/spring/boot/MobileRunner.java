package com.xworkz.spring.boot;


import java.util.Map;
import java.util.TreeMap;

public class MobileRunner {

	public static void main(String[] args) {
		Map<String, Double> mobile = new TreeMap<String, Double>((e1,e2)->e2.compareTo(e1));
		
		mobile.put("Redmi Note 7s", 12500D);
		mobile.put("Realme norzo 30", 13500D);
		mobile.put("One plus node ", 19000D);
		mobile.put("Samsung M51", 25000D);
		mobile.put("OPPo", 15000D);
		mobile.put("VIVO", 12000D);
		mobile.put("Redmi 9", 10000D);
		mobile.put("NOkia", 3000D);
		mobile.put("Apple", 125000D);
		mobile.put("Micromax", 5000D);

		mobile.forEach((m, n) -> System.out.println(m.toUpperCase() + "--" + n));
		System.out.println(System.lineSeparator());
		mobile.forEach((mob, price) -> {
			if (price > 10000D) {
				System.out.println(mob + "--" + price);
			}
		});
		System.out.println(System.lineSeparator());
		mobile.forEach((a, b) -> {
			if (a.length() < 8) {
				System.out.println(a + "==" + b);
			}
		});
		System.out.println(System.lineSeparator());
		mobile.forEach((a1,a2)->{
			if(a2>=10000D) {
				System.out.println(a1);
				mobile.remove(a1);
			}
		});
		//mobile.forEach((a,d)->System.err.println(a+"-"+d));

	}

}
