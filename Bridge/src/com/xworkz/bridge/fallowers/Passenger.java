package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.MetroRules;

public class Passenger implements MetroRules {

	@Override
	public boolean ticket() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int ticketPrice() {
		// TODO Auto-generated method stub
		return 25;
	}

}
