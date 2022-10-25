package com.xworkz.Product.boult;

public class Mango {
	public String name;//
	public double quantity;// ref
	public double price;// method
	public String treeAge = "30monts";// litrellal
	public static String farmHouse;// static

	static {
		farmHouse = "Hiremath'S(Brandhavana) ";
	}

	public Mango(double quantity) {
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
		System.out.println(treeAge);
		System.out.println(farmHouse);
	}
}
