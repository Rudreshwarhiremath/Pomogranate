package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Court;

public class commanMan implements Court {

	@Override
	public boolean justice() {
	System.out.println("Court gives justices");
		return false;
	}

	@Override
	public boolean evidence() {
		System.out.println("Court required evidence");
		return false;
	}

	@Override
	public boolean client() {
		System.out.println("Criminals");
		return false;
	}

	@Override
	public boolean judge() {
		System.out.println("main rule is judge ");
		return false;
	}

	@Override
	public boolean lawyer() {
		System.out.println("Evidience presents in the form lawyer");
		return false;
	}

}
