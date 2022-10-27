package com.xworkz.Association.boot;

import com.xworkz.Association.Constants.Type;

public class Fuel {
	public Brand brand;
	public boolean special=true;
	public Type type = Type.DISELE;
	public double price;
	public double quantity;

	public Fuel(boolean special, double price, double quantity) {
		super();
		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}

	public void totalPrice() {
		double total = price * quantity;
		System.out.println("Total price  "+total+"Rs");
	}

	public void reading() {
		Brand brand = new Brand("HP", "24AAACH1118B1ZI", "Banglore", "4Star");
		brand.show();
		System.out.println(special);
		System.out.println(price+"Rs");
		System.out.println(quantity+"L");
		System.out.println(type);
		
	}

}
