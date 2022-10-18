package com.xworkz.TeaTime.Kalburgi;

public class Tractor {
	public String name;
	public String brand;
	public long price;
	public String colour;
	public int hp;
	public String model;

	public Tractor() {

	}

	public Tractor(String name) {
		this();
		this.name = name;
	}

	public Tractor(String name, String brand) {
		this(name);
		this.brand = brand;
	}

	public Tractor(String name, String brand, long price) {
		this(name, brand);
		this.price = price;

	}

	public Tractor(String name, String brand, long price, String colour) {
		this(name, brand, price);
		this.colour = colour;
	}

	public Tractor(String name, String brand, long price, String colour, int hp) {
		this(name, brand, price, colour);
		this.hp = hp;
	}

	public Tractor(String name, String brand, long price, String colour, int hp, String model) {
		this(name, brand, price, colour, hp);
		this.model = model;
	}

}
