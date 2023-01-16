package com.xworkz.indhana.things;

import org.springframework.stereotype.Component;

import com.xworkz.indhana.intera.Fuel;

@Component
public class Diesel implements Fuel {
	public Diesel() {
		System.out.println("creayed Disele");
	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub

	}

}
