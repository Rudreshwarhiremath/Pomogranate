package com.xworkz.inheritance.riding;

public class OrionMall extends ShoppingMall {
	public String name;

	public OrionMall(int floors, double bill, String name) {
		super(10, 150000);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		super.display();
		System.out.println("Shopping Mall name:" + name);
	}

}
