package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Building;

public class Builders implements Building {

	@Override
	public boolean basement(String yes) {
		System.out.println(yes);
		return false;
	}

	@Override
	public double investment(long cost) {
		System.out.println(cost);
		return 0;
	}

	@Override
	public int workers(int set) {
		System.out.println(set);
		return 0;
	}

	@Override
	public String[] matterials(String matterials) {
		System.out.println(matterials);
		return null;
	}

	@Override
	public String engineering(String name) {
		System.out.println(name);
		return null;
	}

}
