package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Bike;

public class BikeRunner {

	public static void main(String[] args) {
      String[]tyre= {"105/75","105/76"};
      Bike bike=new Bike("Passionpro", "Village", 2, "Hero", 4, tyre, "KA56J2365");
      bike.reading();
	}

}
