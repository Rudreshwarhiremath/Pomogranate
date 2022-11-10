package com.xworkz.inheritance.Flames;

public class Akshara extends HR {
	public String bikename;

	public Akshara(String name, double sallery, String bikename) {
		super("Sudharashan", 25000);
		this.bikename = bikename;
	}

	public void hire() {
		super.hire();
		System.out.println(bikename);
	}

}
