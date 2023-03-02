package ProgramingApti;

import java.util.ArrayList;

public class Javatest3 {
	public static void main(String[] args) {
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(14);
		System.out.println(set.size());
		ArrayList<Integer> get = new ArrayList<Integer>();
		get.add(7);
		get.add(8);
		get.add(9);
		get.add(11);
		get.add(12);
		System.out.println(get.size());
		
		ArrayList<Integer> got = new ArrayList<Integer>();
		got.addAll(get);
		got.addAll(set);
		System.out.println("+++"+got.size());
		System.out.println(got);



	}

}
