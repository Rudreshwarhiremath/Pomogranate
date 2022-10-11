package com.xworkz.BMTC.Mysore;

import com.xworkz.BMTC.banglore.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate sweet = new Chocolate();
		Chocolate nice = new Chocolate();
		Chocolate rate = new Chocolate();
		Chocolate taste = new Chocolate();
		System.out.println(sweet.name);
		System.out.println(nice.brand);
		System.out.println(rate.price);
		System.out.println(taste.flavour);
		sweet.name = "Snickers";
		nice.brand = "Neslete";
		rate.price = 25;
		taste.flavour = "choco with nuts";
		System.out.println(sweet.name);
		System.out.println(nice.brand);
		System.out.println(rate.price);
		System.out.println(taste.flavour);

	}

}
