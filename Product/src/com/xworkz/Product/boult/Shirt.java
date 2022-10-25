package com.xworkz.Product.boult;

public class Shirt {
	public String name;//
	public int quantity;// ref
	public double price;// method
	public String brand = "Park venue";// litrellal
	public static String shopname;// static

	static {
		shopname = "S S Para";
	}

	public Shirt(int quantity) {
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
		System.out.println(brand);
		System.out.println(shopname);

	}
}
