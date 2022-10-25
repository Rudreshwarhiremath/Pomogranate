package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		Milk kmf = new Milk(6);
		kmf.name = "Nemmdi";
		kmf.setPrice(60);
		kmf.reading();
		kmf.total();

	}

}
