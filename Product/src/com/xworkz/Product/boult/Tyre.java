package com.xworkz.Product.boult;

public class Tyre {

	public String brand;
	public char code;
	public String type;
	public short branches;
	public String color;
	public int[] price;
	public double[] weight;
	public double[] perimeter;
	public String[] factoryNames;
	public long[] revenues;
	public double[] radius;

	public Tyre(String brand, char code, String type, int[] price, String color, double[] weight, double[] perimeter,
			String[] factoryNames, short branches, long[] revenues, double[] radius) {
		this.brand = brand;
		this.code = code;
		this.type = type;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.perimeter = perimeter;
		this.factoryNames = factoryNames;
		this.branches = branches;
		this.revenues = revenues;
		this.radius = radius;

	}

	public void reading() {
		System.out.println(brand);
		System.out.println(code);
		System.out.println(type);
		System.out.println(branches);
		System.out.println(color);
		for (int i = 0; i < weight.length; i++) {
			System.out.println("weight" + weight[i]);
		}
		for (int i = 0; i < perimeter.length; i++) {
			System.out.println("perimeter" + perimeter[i]);
		}
		for (int i = 0; i < factoryNames.length; i++) {
			System.out.println("factoryNames" + factoryNames[i]);
		}
		for (int i = 0; i < revenues.length; i++) {
			System.out.println("revenues" + revenues[i]);
		}
		for (int i = 0; i < radius.length; i++) {
			System.out.println("radius" + radius[i]);
		}
		for (int i = 0; i < price.length; i++) {
			System.out.println("price" + price[i]);
		}
	}

}
