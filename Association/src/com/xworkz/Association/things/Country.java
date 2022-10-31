package com.xworkz.Association.things;

public class Country {
	public String name;
	public City[] cities;
	public President president;

	public Country(String name) {
		this.name = name;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void display() {
		System.out.println("Displaying information");
		System.out.println(this.name);
		if (this.president != null) {
			president.show();
		} else {
			System.out.println("President is not in list");
		}
		if (cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City element = this.cities[i];
				System.out.println(element);
				if (element != null) {
					element.show();
				} else {
					System.out.println("element is null " + i);
				}
			}

		} else {
			System.out.println("City is null");
		}

	}
}
