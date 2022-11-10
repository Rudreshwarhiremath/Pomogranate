package com.xworkz.inheritance.Flames;

public class PetrolBunk {
	public double petrolRate;
	public double diseleRate;
	public PetrolBunk(double petrolRate, double diseleRate) {
		super();
		this.petrolRate = petrolRate;
		this.diseleRate = diseleRate;
	}
	public void HP() {
		System.out.println("Petrolrate:"+petrolRate);
		System.out.println("Diselerate:"+diseleRate);
	}
	public void indian() {
		System.out.println("density of petrol= 0.5");
		System.out.println("density of disele= 1.0");
	}

}
