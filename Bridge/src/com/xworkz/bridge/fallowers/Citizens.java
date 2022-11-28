package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.PoliceRules;

public class Citizens implements PoliceRules {

	@Override
	public boolean traficSignel() {
		System.out.println("Signel of Trafic.....");
		return false;
	}

	@Override
	public boolean signalJump() {
		System.out.println("Signel of Trafic..... do not jump signel");
		return false;
	}

	@Override
	public boolean fine(int collect) {
		System.out.println("fine for signal jump :"+collect);
		return false;
	}

	@Override
	public boolean wearSeatbelt() {
		System.out.println("wear seat belt");
		return false;
	}

	@Override
	public boolean traficControl() {
		System.out.println(" by using Signel of Trafic can control..");
		return false;
	}



}
