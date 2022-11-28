package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.PublicBus;

public class Person implements PublicBus {

	@Override
	public boolean ticket() {
		System.out.println("ticket");
		return false;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("nosmoking");
		return false;
	}

	@Override
	public boolean seatReserve() {
		System.out.println("reserve");
		return false;
	}

	@Override
	public boolean ristrictTouchs() {
		System.out.println("dont touch cabin");
		return false;
	}

	@Override
	public boolean noTalkWithDrivers() {
		System.out.println("donot talk with drivers");
		return false;
	}

}
