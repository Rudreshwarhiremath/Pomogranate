package com.xworkz.Product.boult;

public class Flower {
	public String name;//
	public double quantity;// ref
	public double price;// method
	public String colour = "Orange";// litrellal
	public static String shopName;// static

	static {
		shopName = "Kathari Flower merchent";
	}

	public Flower(double quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void total() {
		double Total = this.quantity * this.price;
		System.out.println("Total price" + Total);
	}

	public void reading() {
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println(colour);
		System.out.println(shopName);

	}
}
