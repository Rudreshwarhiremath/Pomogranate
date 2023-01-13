package com.xworkz.cold.Vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;
	@Autowired
	private Area area;

	public Company() {
		System.out.println("created compnay");
	}

	public Location location() {
		return location;
	}

	public Area area() {
		return area;
	}

}
