package com.xworkz.inheritance.Flames;

public class WarJet {
	public String origin;
	public double price;

	public WarJet(String origin, double price) {
		super();
		this.origin = origin;
		this.price = price;
	}

	public void show() {
		System.out.println(origin);
		System.out.println(price);
	}

	public void display() {
		System.out.println("Rafel is best for war");
		System.out.println("It makes more contervercy");
	}

}
