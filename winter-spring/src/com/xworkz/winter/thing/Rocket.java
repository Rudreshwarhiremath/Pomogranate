package com.xworkz.winter.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("India")
	private String country;
	@Value("PSLV4")
	private String name;
	@Value("600")
	private Double budget;

	public Rocket() {
		System.out.println("created default constructer of rocket");
	}

	public String getCountry() {
		this.country = country;
		return country;
	}

	public String getName() {
		this.name = name;
		return name;
	}

	public Double getBudget() {
		this.budget = budget;
		return budget;
	}

}
