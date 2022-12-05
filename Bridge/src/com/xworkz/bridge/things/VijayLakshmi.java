package com.xworkz.bridge.things;

public class VijayLakshmi extends JavaTrainee implements KarnartakaRTO {

	@Override
	public boolean paidTax(double tax) {
		System.out.println("paid tax in VL");
		return true;
	}

	@Override
	public double gst() {
		System.out.println("grtting gst in VL");
		return 18.25;
	}

	@Override
	boolean training() {
		System.out.println("Getting training in VL");
		return true;
	}

	@Override
	boolean executeProgram() {
		System.out.println("executeProgram in VL");
		return true;
	}

	@Override
	boolean eat() {
		System.out.println("person eating in VL");
		return true;
	}

	@Override
	boolean sleep() {
		System.out.println("Person sleeping on bed");
		return true;
	}

	@Override
	public double vat() {
		System.out.println("Vat is in VL");
		return 155.26;
	}

}
