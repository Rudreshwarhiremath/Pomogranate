package com.xworkz.Product.boult;

public class Mahindra {
	public String name;
	public String brand ;
	public int branchs;
	public String specilaty;
	public long workers;
	public String[] Trucks;
	public String[] Cars;
	public String[] Buses;
	public String[] locations;
	public String[] variteUses;
	public String[] varites;
	

	public Mahindra(String name, String brand,int branchs , String specilaty, long workers, String[] Trucks,
			String[] Cars, String[] Buses, String[] locations, String[] variteUses, String[] varites) {
		this.name = name;
		this.brand = brand;
		this.branchs = branchs;
		this.specilaty = specilaty;
		this.workers = workers;
		this.Trucks = Trucks;
		this.Cars = Cars;
		this.Buses = Buses;
		this.locations = locations;
		this.variteUses = variteUses;
		this.varites = varites;
	}

	public void reading() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(branchs);
		System.out.println(specilaty);
		System.out.println(workers);
		for (int i = 0; i < Trucks.length; i++) {
			System.out.println("Trucks:" + Trucks[i]);
		}
		for (int i = 0; i < Cars.length; i++) {
			System.out.println("Cars iteams:" + Cars[i]);
		}
		for (int i = 0; i < Buses.length; i++) {
			System.out.println("Buses:" + Buses[i]);
		}
		for (int i = 0; i < locations.length; i++) {
			System.out.println("location:" + locations[i]);
		}
		for (int i = 0; i < variteUses.length; i++) {
			System.out.println("variteUses:" + variteUses[i]);
		}
		for (int i = 0; i < varites.length; i++) {
			System.out.println("varites:" + varites[i]);
		}
	}

}
