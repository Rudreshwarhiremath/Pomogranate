package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Tea;

public class TeaLovers implements Tea{

	@Override
	public boolean Stow() {
		System.out.println("stow");
		return false;
	}

	@Override
	public boolean milk() {
		System.out.println("milk");
		return false;
	}

	@Override
	public boolean teaPowder() {
		System.out.println("tea powder");
		return false;
	}

	@Override
	public boolean sugure() {
		System.out.println("sugure");
		return false;
	}

	@Override
	public int cups() {
		System.out.println("tea cups");
		return 0;
	}

}
