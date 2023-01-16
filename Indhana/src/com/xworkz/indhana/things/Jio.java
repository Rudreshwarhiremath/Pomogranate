package com.xworkz.indhana.things;

import org.springframework.stereotype.Component;

import com.xworkz.indhana.intera.Provider;
@Component
public class Jio implements Provider {
	public Jio() {
		System.out.println("Jio created");
	}

	@Override
	public void connect() {
		System.out.println("implimented Provider in Jio");
	}

}
