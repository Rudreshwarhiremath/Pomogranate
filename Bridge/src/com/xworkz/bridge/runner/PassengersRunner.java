package com.xworkz.bridge.runner;

import com.xworkz.bridge.fallowers.Passengers;

public class PassengersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passengers get=new Passengers();
		get.airticket();
		get.physicalCheck();
		get.document();
		get.seatNo();
		get.luggageCheck();

	}

}
