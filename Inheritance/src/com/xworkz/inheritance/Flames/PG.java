package com.xworkz.inheritance.Flames;

public class PG extends Home {
	public double price;

	public PG(String name, String location, double price) {
		super(name, location);
		this.price = price;
	}

	public void show() {
		super.show();
		System.out.println(price);
	}
}
