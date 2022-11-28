package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Metro;

public class MetroUsers implements Metro{

	@Override
	public boolean mask() {
		System.out.println("mask complesry");
		return false;
	}

	@Override
	public int tocken() {
		System.out.println("tocken");
		return 0;
	}

	@Override
	public boolean Checkup() {
		System.out.println("checkup");
		return false;
	}

	@Override
	public String toWards() {
		System.out.println("nagasandra");
		return null;
	}

	@Override
	public int platform() {
		System.out.println("2");
		return 0;
	}

}
