package com.xworkz.indhana.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.indhana.intera.Fuel;
import com.xworkz.indhana.intera.PetroleBunk;

@Component
public class Shell implements PetroleBunk {

	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;

	public Shell() {
		System.out.println("created shell");
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub

	}

}
