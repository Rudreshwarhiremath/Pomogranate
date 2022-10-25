package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		 Lamp rose=new Lamp(6);
		 rose.name="serial bulbs";
		 rose.setPrice(50);
		 rose.reading();
		 rose.total();

	}

}
