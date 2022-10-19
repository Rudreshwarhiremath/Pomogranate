package com.xworkz.Product.boult;

public class Light {
	public String company;
	public char lightCode;
	public String producer;
	public String type;
	public short quantity;
	public String[] color;
	public double[] weight;
	public int[] price;
	public long[] range;
	public double[] length;
	public String[] adress;

	public Light(String company, char lightCode, int[] price, String[] color, double[] weight, String producer,
			String type, short quantity, long[] range, double[] length, String[] adress) {
		this.company = company;
		this.lightCode = lightCode;
		this.type = type;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.producer = producer;
		this.quantity = quantity;
		this.range = range;
		this.length = length;
		this.adress = adress;
	}

	public void reading() {
		System.out.println(this.company);
		System.out.println(this.lightCode);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.weight);
		System.out.println(this.producer);
		System.out.println(this.quantity);
		System.out.println(this.range);
		System.out.println(this.length);
		System.out.println(this.adress);
		for (int i = 0; i < this.adress.length; i++) {
			System.out.println(adress[i]);
		}
		for (int i = 0; i < this.price.length; i++) {
			System.out.println(price[i]);
		}
		for (int i = 0; i < this.color.length; i++) {
			System.out.println(color[i]);
		}
		for (int i = 0; i < this.weight.length; i++) {
			System.out.println(weight[i]);
		}
		for (int i = 0; i < this.range.length; i++) {
			System.out.println(range[i]);
		}
		for (int i = 0; i < this.length.length; i++) {
			System.out.println(length[i]);
		}
	}

}
