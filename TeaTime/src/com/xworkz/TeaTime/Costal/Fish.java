package com.xworkz.TeaTime.Costal;

public class Fish {
	public String name;
	public String type;
	public int price;
	public double weight;
	public double length;

	public Fish(String name, String type, int price, double weight, double length) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.length = length;

	}

	public Fish(double weight, double length) {
		this.length = length;
		this.weight = weight;

	}

	public Fish(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Fish(int price) {
		this.price = price;
	}

	public Fish(double weight, String type) {
		this.weight = weight;
		this.type = type;
	}

	public Fish(double length, int price) {
		this.length = length;
		this.price = price;
	}

	public Fish(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public Fish(int price, String name) {
		this.price = price;
		this.name = name;
	}
}
