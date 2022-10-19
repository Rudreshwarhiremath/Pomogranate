package com.xworkz.Product.boult;

public class Bus {
	public String name;
	public String brand;
	public String model;
	public int seats;
	public String Drivers;
	public String[] Tyreno;
	public char[] gears;
	public String[] controls;
	public String[] facilities;

	public Bus(String name, String brand, int seats, String model, String Drivers, String[] Tyreno, char[] gears,
			String[] controls, String[] facilities) {
		this.name = name;
		this.brand = brand;
		this.seats = seats;
		this.model = model;
		this.Drivers = Drivers;
		this.Tyreno = Tyreno;
		this.gears = gears;
		this.controls = controls;
		this.facilities = facilities;
	}

	public void reading() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(seats);
		System.out.println(model);
		System.out.println(Drivers);
		for (int i = 0; i < Tyreno.length; i++) {
			System.out.println("Tyreno:" + Tyreno[i]);
		}
		for (int i = 0; i < gears.length; i++) {
			System.out.println("gears :" + gears[i]);
		}
		for (int i = 0; i < controls.length; i++) {
			System.out.println("controls:" + controls[i]);
		}
		for (int i = 0; i < facilities.length; i++) {
			System.out.println("facilities:" + facilities[i]);
		}
	}

}