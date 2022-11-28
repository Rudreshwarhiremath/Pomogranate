package com.xworkz.bridge.runner;

import com.xworkz.bridge.fallowers.Citizens;

public class PoliceRulesRunner {

	public static void main(String[] args) {
		Citizens city=new Citizens();
		city.traficControl();
		city.traficSignel();
		city.fine(500);
		System.out.println();
		city.signalJump();
		city.wearSeatbelt();

	}

}
