package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.MarriageRules;

public class Couples implements MarriageRules {

	@Override
	public int age() {
		System.out.println("marriage age male 24 female 21");
		return 0;
	}

	@Override
	public String[] couples() {
		System.out.println("Couples name");
		return null;
	}

	@Override
	public boolean parentsAgree() {
		System.out.println("yes");

		return false;
	}

	@Override
	public double shopping() {
		System.out.println("shopping");
		return 0;
	}

	@Override
	public boolean satisfy() {
		System.out.println("Satisfy");
		return false;
	}

}
