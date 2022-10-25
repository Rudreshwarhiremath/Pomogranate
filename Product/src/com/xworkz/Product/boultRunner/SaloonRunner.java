package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Saloon;

public class SaloonRunner {
	public static void main(String[] args) {
		Saloon Saloon = new Saloon(250);
		Saloon.blade = "Ashok";
		Saloon.setShaveCream("Gillete");
		Saloon.reading();

	}
}
