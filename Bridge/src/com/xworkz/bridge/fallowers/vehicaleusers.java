package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.TraficRules;

public class vehicaleusers implements TraficRules {

	@Override
	public boolean takeRight() {
		System.out.println("takeRight");
		return false;
	}

	@Override
	public boolean gostright() {
		System.out.println("gostright");
		return false;
	}

	@Override
	public boolean noUturn() {
		System.out.println("noUturn");
		return false;
	}

	@Override
	public boolean noOvertake() {
		System.out.println("noOvertake");
		return false;
	}

	@Override
	public boolean keepleft() {
		System.out.println("keepleft");
		return false;
	}

}
