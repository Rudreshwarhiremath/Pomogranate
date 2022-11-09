package com.xworkz.inheritance.riding;

public class Prashant extends Director {
	public int films;

	public Prashant(String name, String type,int films) {
		super("Prem","filmy director");
		this.films=films;
	}
	public void display() {
		super.display();
		System.out.println("Films :"+films);
	}

}
