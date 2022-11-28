package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Mobile;

public class MobileUsers implements Mobile {

	@Override
	public String email() {
		System.out.println("email id");
		return null;
	}

	@Override
	public int charge() {
		System.out.println("battery");
		return 0;
	}

	@Override
	public boolean sim() {
		System.out.println("sim card");
		return false;
	}

	@Override
	public long number() {
		System.out.println("55555555555");
		return 0;
	}

	@Override
	public boolean using() {
		System.out.println("micromax");
		return false;
	}

}
