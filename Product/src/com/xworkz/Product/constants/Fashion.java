package com.xworkz.Product.constants;

public enum Fashion {
	MEN("Shirt", 'L', 499), WOMEN("Top", 'M', 299), KIDS("T-shirt", 's', 200), BAGS("laptop", 'X', 399),
	SHOES("Sports", 'L', 1999);

	public String type;
	public char size;
	public long price;

	private Fashion(String type, char size, long price) {
		this.type = type;
		this.size = size;
		this.price = price;

	}

}
