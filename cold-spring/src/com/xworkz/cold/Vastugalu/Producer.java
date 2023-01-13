package com.xworkz.cold.Vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private Assistant assistant;
	@Autowired
	private Company company;

	public Producer() {
		System.out.println("created producer");
	}

	public Assistant assistant() {
		return assistant;
	}

	public Company company() {
		return company;
	}
}
