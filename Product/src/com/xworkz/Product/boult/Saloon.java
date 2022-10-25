package com.xworkz.Product.boult;

import com.xworkz.Product.constants.cuttingType;

public class Saloon {
	public cuttingType type;
	public String blade;
	public double price;
	public String shaveCream;
	public static String shopName;

	static {
		shopName = "7Hills";
	}

	public Saloon(double price) {
		this.price = price;
	}

	public void setShaveCream(String shaveCream) {
		this.shaveCream = shaveCream;
	}

	public void reading() {
		System.out.println(cuttingType.SPIKE);
		System.out.println(blade);
		System.out.println(price);
		System.out.println(shaveCream);
		System.out.println(shopName);

	}
}
