package com.xworkz.ipl.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleRunner {

	public static void main(String[] args) {
		List<Integer> ref =new ArrayList<Integer>();
		ref.add(28);
		ref.add(34);
		ref.add(94);
		ref.add(69);
		
		Collections.sort(ref);
		System.out.println(ref); //this will be in ascending order
		Collections.reverse(ref);
		System.out.println(ref);  //descending order
		
		ref.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.println(e)); //descending order

	}

}
