package com.xworkz.TeaTime.Kalburgi;

public class Chain {

	public String type;
	public int price;
	public double length;
	public String material;
	public double weight;
	public boolean stolen;
	public String usedfor;
	public boolean fresh;

	public Chain() {

	}

	public Chain(String type) {
		this();
		this.type = type;
	}

	public Chain(int price) {
		this("Taiyo");
		this.price = price;

	}

	public Chain(double weight) {
		this(450);
		this.weight = weight;

	}

	public Chain(boolean fresh) {
		this(1000.12);
		this.fresh = fresh;

	}

	public Chain(String material, String usedfor) {
		this(true);
		this.material = material;
		this.usedfor = usedfor;

	}

	public Chain(boolean stolen, boolean fresh) {
		this("steel", "dog");
		this.stolen = stolen;
		this.fresh = fresh;
	}

	public Chain(String type, String usedfor, String material) {
		this(true, false);
		this.type = type;
		this.usedfor = usedfor;
		this.material = material;

	}

	public Chain(int price, double weight) {
		this("Dog", "StainlessSteel");
		this.price = price;
		this.weight = weight;

	}

	public Chain(String type, int price, double length, String material, double weight, boolean stolen, String usedfor,
			boolean fresh) {
		this(500);

	}

}
