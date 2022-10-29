package com.xworkz.Association.things;

public class City {
	public Name name;
	public boolean capital;
	public double area;

	public City(Name name) {
		super();
		this.name = name;

	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void show() {
		System.out.println(this.capital);
		System.out.println(this.area);
		if (name != null) {
			//System.out.println(this.name);
			this.name.show1();
		} else {
			System.out.println("name is null");
		}

	}

}
