package com.xworkz.indhana.things;

import org.springframework.stereotype.Component;

import com.xworkz.indhana.intera.Provider;
@Component
public class Airtel implements Provider {
	public Airtel() {
		System.out.println("airtel created ");
	}

	@Override
	public void connect() {
		System.out.println("implimented Provider in Airtel");

	}

}
