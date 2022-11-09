package com.xworkz.inheritance.riding;

public class ShoppingMall {
	public int floors;
	public double bill;

	public ShoppingMall(int floors, double bill) {
		super();
		this.floors = floors;
		this.bill = bill;
	}

	public void display() {
		System.out.println("mall floors:" + floors);
		System.out.println("Shopping bill:" + bill);
	}

}
