package com.xworkz.inheritance.nut;

public class ArrangeMarrige extends Marrige {
	public String bride;
	public String groom;

	public ArrangeMarrige(String type, String location, String date, String bride, String groom) {
		super(type, location, date);
		this.bride = bride;
		this.groom = groom;
	}

}
