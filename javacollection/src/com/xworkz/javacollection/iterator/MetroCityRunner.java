package com.xworkz.javacollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityRunner {

	public static void main(String[] args) {
		String metroCity1="Banglore";
		String metroCity2="Hydrabad";
		String metroCity3="Mumbai";
		String metroCity4="Pune";
		String metroCity5="Dehali";
		
		Collection<String> cityname=new ArrayList<String>();
		cityname.add(metroCity5);
		cityname.add(metroCity4);
		cityname.add(metroCity3);
		cityname.add(metroCity2);
		cityname.add(metroCity1);
		
		System.out.println(cityname);
		System.out.println("=============to string=============");
        
		for (String name : cityname) {
			System.out.println(name);
			
		}
		System.out.println("=============for each=============");
		Iterator<String> city=cityname.iterator();
		while(city.hasNext()) {
			String metro=city.next();
			System.out.println(metro);
		}
		System.out.println("=============Iterator=============");



	}

}
