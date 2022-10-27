package com.xworkz.Association.things;

import com.xworkz.Association.boot.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		Fuel pump=new Fuel(true,87.89,30.55);
		pump.reading();
		pump.totalPrice();

	}

}
