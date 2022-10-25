package com.xworkz.Product.constants;

public enum Mobiles {
	REDMI("MI"), SAMSUNG("samsung"), REALME("realmi"), POCO("poco"), OPPO("oppo"), VIVO("vivo"), IPHONE("apple");

	public String types;

	private Mobiles(String types) {
		this.types = types;
	}
}
