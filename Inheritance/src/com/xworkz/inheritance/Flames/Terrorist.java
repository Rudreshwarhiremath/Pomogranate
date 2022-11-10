package com.xworkz.inheritance.Flames;

public class Terrorist {
	public String location;
	public String gun;

	public Terrorist(String location, String gun) {
		super();
		this.location = location;
		this.gun = gun;
	}

	public void show() {
		System.out.println(location);
		System.out.println(gun);
	}

	public void display() {
		System.out.println("It is a another method");
	}

}
