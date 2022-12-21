package com.xworkz.javacollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) {
		String watch1="Fastrack";
		String watch2="Titan";
		String watch3="HMT";
		String watch4="Sonata";
		String watch5="Ajanta";
		
		Collection<String> watch = new ArrayList<String>();
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch3);
		watch.add(watch2);
		watch.add(watch1);
		System.out.println(watch);
		System.out.println("===========to string==========");
		
		Iterator<String> value=watch.iterator();
		while(value.hasNext()) {
		 String set=value.next();
		 System.out.println(set);
		}
		System.out.println("=========== iterator==========");
		for (String getwatch : watch) {
			System.out.println(getwatch);
		}
		System.out.println("=========== for each==========");

	}

}
