package com.xworkz.indhana.things;


import org.springframework.stereotype.Component;

import com.xworkz.indhana.intera.Fuel;

@Component
public class Petrol implements Fuel {

	public Petrol() {
System.out.println("Created petrol");	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub
	
	}

}
