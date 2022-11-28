package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.DrivingRules;

public class Drivers implements DrivingRules {

	@Override
	public boolean indian() {
		System.out.println("indian");
		return false;
	}

	@Override
	public boolean age() {
		System.out.println("18");
		return false;
	}

	@Override
	public boolean DL() {
		System.out.println("yes");
		return false;
	}

	@Override
	public boolean physicaly() {
		System.out.println("Physical well control");
		return false;
	}

	@Override
	public boolean driver() {
		System.out.println("driver");
		return false;
	}

}
