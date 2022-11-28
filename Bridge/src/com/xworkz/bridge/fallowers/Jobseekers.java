package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Jobrules;

public class Jobseekers implements Jobrules {

	@Override
	public int age() {
		System.out.println("18+");
		return 0;
	}

	@Override
	public String name() {
		System.out.println("name");
		return null;
	}

	@Override
	public String[] skills() {
		System.out.println("skills");
		return null;
	}

	@Override
	public String qualification() {
		System.out.println("qulification");
		return null;
	}

	@Override
	public double sallery() {
		System.out.println("payment");
		return 0;
	}

}
