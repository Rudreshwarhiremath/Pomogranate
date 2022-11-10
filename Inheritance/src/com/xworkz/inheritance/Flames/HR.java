package com.xworkz.inheritance.Flames;

public class HR {
	public String name;
	public double sallery;

	public HR(String name, double sallery) {
		super();
		this.name = name;
		this.sallery = sallery;
	}

	public void hire() {
		System.out.println("HR name is Sam");
		System.out.println(name);
		System.out.println(sallery);
	}

	public void fire() {
		System.out.println("HR can remove anybody");
		System.out.println("X workz is a best training institute");
	}

}
