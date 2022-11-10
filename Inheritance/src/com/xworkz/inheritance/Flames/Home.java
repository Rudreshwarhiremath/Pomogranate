package com.xworkz.inheritance.Flames;

public class Home {
	public String name;
	public String location;

	public Home(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void show() {
		System.out.println("PG name:" + name);
		System.out.println("Location:" + location);
	}

	public void display() {
		System.out.println("it is a home but away from home");
		System.out.println("It is better comper to Hostel");
	}

}
