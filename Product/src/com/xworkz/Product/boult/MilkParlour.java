package com.xworkz.Product.boult;

public class MilkParlour {
	public String name;
	public String brand ;
	public int shopno;
	public String specilaty;
	public int workers;
	public String[] milkProducts;
	public String[] available;
	public String[] Sweets;
	public String[] Snacks;
	public int[] rates;
	public String[] colditeams;
	

	public MilkParlour(String name, String brand,int shopno , String specilaty, int workers, String[] milkProducts,
			String[] available, String[] Sweets, String[] Snacks, int[] rates, String[] colditeams) {
		this.name = name;
		this.brand = brand;
		this.shopno = shopno;
		this.specilaty = specilaty;
		this.workers = workers;
		this.milkProducts = milkProducts;
		this.available = available;
		this.Sweets = Sweets;
		this.Snacks = Snacks;
		this.rates = rates;
		this.colditeams = colditeams;
	}

	public void reading() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(shopno);
		System.out.println(specilaty);
		System.out.println(workers);
		for (int i = 0; i < milkProducts.length; i++) {
			System.out.println("milkProducts:" + milkProducts[i]);
		}
		for (int i = 0; i < available.length; i++) {
			System.out.println("available iteams:" + available[i]);
		}
		for (int i = 0; i < Sweets.length; i++) {
			System.out.println("Sweets:" + Sweets[i]);
		}
		for (int i = 0; i < Snacks.length; i++) {
			System.out.println("Snacks:" + Snacks[i]);
		}
		for (int i = 0; i < rates.length; i++) {
			System.out.println("products rates:" + rates[i]);
		}
		for (int i = 0; i < colditeams.length; i++) {
			System.out.println("colditeams:" + colditeams[i]);
		}
	}

}
