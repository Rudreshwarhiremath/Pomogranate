package com.xworkz.Product.boult;

import com.xworkz.Product.constants.Brand;

public class Milk {
	public String name;//
	public double quantity;// ref
	public double price;// method
	public String milkproducts = "Halu";// literal
	public static String farmHouse;// static
	public Brand brand=Brand.NANDINI;

	static {
		farmHouse = "Hiremath'S(Brandhavana) ";
	}

	public Milk(double quantity) {
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
		System.out.println(quantity+"ltr");
		System.out.println(price);
		System.out.println(brand);
		System.out.println(farmHouse);
		System.out.println(milkproducts);

	}
}
