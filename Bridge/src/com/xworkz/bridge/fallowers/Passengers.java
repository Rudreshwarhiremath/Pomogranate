package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Airbus;

public class Passengers  implements Airbus{

	@Override
	public boolean airticket() {
		System.out.println("airTicket");
		return false;
	}

	@Override
	public boolean physicalCheck() {
		System.out.println("checking");
		return false;
	}

	@Override
	public boolean document() {
		System.out.println("passport");
		return false;
	}

	@Override
	public boolean seatNo() {
		System.out.println("25");
		return false;
	}

	@Override
	public boolean luggageCheck() {
		System.out.println("checking");
		return false;
	}

}
