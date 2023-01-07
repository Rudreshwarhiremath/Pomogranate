package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateRunner {

	public static void main(String[] args) {
		Map<Double, String> choco=new LinkedHashMap<Double, String>();
		choco.put(10D, "Peark");
		choco.put(80D, "Silk DairiMilk");
		choco.put(20D, "DairiMilk");
		choco.put(5D, "Kiss me");
		choco.put(15D, "Melody");
		choco.put(25D, "Snickers");
		choco.put(12D, "Kit kat");
		choco.put(11D, "MilkBar");
		choco.put(1D, "Eclers");
		choco.put(10D, "Kachha Mango");
		
		Collection<String> value=choco.values();
		value.forEach(ele->System.out.println(ele));
		
		Set<Double> keys=choco.keySet();
		keys.forEach(ele->System.out.println(ele));
		
		Set<Entry<Double, String>> entries=choco.entrySet();
		entries.forEach(ele->System.out.println(ele));
		
	}

}
