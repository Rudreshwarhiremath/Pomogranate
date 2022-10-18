package com.xworkz.Product.boult;

public class Bike {

	public String name;
	public String location;
	public int capacity;
	public String brand;
	public int indicaters;
	public String[] Tyreno;
	public String vehicalNo;

	public Bike(String name, String location, int capacity, String brand, int indicaters, String[] Tyreno,
				String vehicalNo) {
			this.name = name;
			this.location = location;
			this.capacity = capacity;
			this.brand = brand;
			this.indicaters = indicaters;
			this.Tyreno = Tyreno;
			this.vehicalNo = vehicalNo;
		

		}

	public void reading() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(capacity);
		System.out.println(brand);
		System.out.println(indicaters);
		System.out.println(vehicalNo);
		for (int i = 0; i < Tyreno.length; i++) {
			System.out.println("Tyreno:" + Tyreno[i]);
		}
		

	}

}


