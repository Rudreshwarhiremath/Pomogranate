package com.xworkz.Product.boult;

public class Sweet {
	public String name;
	public double quantity;
	public double price;
	public String colour = "White";
	public static String shopName;

	static {
		shopName = "warier";
	}

	public Sweet(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void reading() {
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println(colour);
		System.out.println(shopName);

	}

}
