package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.CollegeRules;

public class Students implements CollegeRules {

	@Override
	public boolean dresscode() {
		System.out.println("dresscode");
		return false;
	}

	@Override
	public boolean timeSence() {
		System.out.println("timing");
		return false;
	}

	@Override
	public boolean disiplane() {
		System.out.println("disiplane");
		return false;
	}

	@Override
	public boolean exam() {
		System.out.println("exam s");
		return false;
	}

	@Override
	public boolean fees() {
		System.out.println("fees");
		return false;
	}

}
