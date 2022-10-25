package com.xworkz.Product.constants;

public enum Electronics {
	LAPTOP("HP", 49999), WATCHES("MI", 1999), HEADPHONES("bout", 499), SOUND("bout",999),CAMERA("canon",8999);
	
	public String brand;
	public long cost;
	
	private Electronics(String brand,long cost) {
		this.brand=brand;
		this.cost=cost;
	}
	

}
