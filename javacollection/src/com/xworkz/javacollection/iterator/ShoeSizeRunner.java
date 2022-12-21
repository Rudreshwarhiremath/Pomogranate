package com.xworkz.javacollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		Integer  size1=1;
		Integer  size2=2;
		Integer  size3=3;
		Integer  size4=4;
		Integer  size5=5;
		Integer  size6=6;
		Integer  size7=7;
		Integer  size8=8;
		Integer  size9=9;
		Integer  size10=13;
		Integer  size11=12;
		Integer  size12=14;
		Integer  size13=15;
		Integer  size14=10;
		Integer  size15=11;
		
		Collection<Integer> size = new ArrayList<Integer>();
		size.add(size1);
		size.add(size2);
		size.add(size3);
		size.add(size4);
		size.add(size5);
		size.add(size6);
		size.add(size7);
		size.add(size8);
		size.add(size9);
		size.add(size10);
		size.add(size11);
		size.add(size12);
		size.add(size13);
		size.add(size14);
		size.add(size15);
		
		System.out.println(size);
		System.out.println("=============to string=============");
		for(Integer value:size) {
			System.out.println(value);
		}
		System.out.println("===============for each=============");
		Iterator<Integer> value=size.iterator();
		while(value.hasNext()) {
		 Integer getSize=value.next();
		 System.out.println(getSize);
		}
		System.out.println("==================Iterator===========");


	}

}
