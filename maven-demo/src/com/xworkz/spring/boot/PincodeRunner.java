package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PincodeRunner {

	public static void main(String[] args) {
		Map<Double, String> pin=new TreeMap<Double, String>();
		pin.put(585331D,"Basavakalyan");
		pin.put(585330D,"Bidar");
		pin.put(585332D,"Bhalki");
		pin.put(585333D,"Humnabad");
		pin.put(585334D,"Aurad");
		pin.put(585335D,"Jevargi");
		pin.put(585336D,"Aland");
		pin.put(5856001D,"Rajajinagar");
		pin.put(5856002D,"Malleshwarm");
		pin.put(585231D,"Kalburgi");
		
		Set<Double> key=pin.keySet();
		key.forEach(ele->System.out.println(ele));
		
		Collection<String> value=pin.values();
		value.forEach(ele->System.out.println(ele));

		Set<Entry<Double, String>> entries=pin.entrySet();
		entries.forEach(ele->System.out.println(ele));

	}

}
