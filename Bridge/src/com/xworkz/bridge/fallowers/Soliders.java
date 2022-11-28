package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Armayrules;

public class Soliders implements Armayrules {

	@Override
	public boolean indian() {
		System.out.println("indian");
		return false;
	}

	@Override
	public int age() {
		System.out.println("22");
		return 0;
	}

	@Override
	public String qualification() {
		System.out.println("sslc");
		return null;
	}

	@Override
	public boolean physical() {
		System.out.println("yes");
		return false;
	}

	@Override
	public int training() {
		System.out.println("yes");
		return 0;
	}

}
