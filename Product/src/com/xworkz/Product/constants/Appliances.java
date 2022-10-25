package com.xworkz.Product.constants;

public enum Appliances {
	WASSHING_MACHINE("Hair", 24999), FRIDGE("Hair", 29999), GYSER("Vguard", 3999), GAS_STOW("Pristage", 1999),
	MIXER("Bajaja", 1499);

	public String brand;
	public long price;

	private Appliances(String brand, long price) {
		this.brand = brand;
		this.price = price;

	}

}
