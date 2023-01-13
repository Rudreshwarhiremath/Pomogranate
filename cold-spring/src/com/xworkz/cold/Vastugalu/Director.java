package com.xworkz.cold.Vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experience experience;
	@Autowired
	private Skill skill;

	public Director() {
		System.out.println("created cirector");
	}

	public Experience experience() {
		return experience;
	}

	public Skill skill() {
		return skill;
	}

}
