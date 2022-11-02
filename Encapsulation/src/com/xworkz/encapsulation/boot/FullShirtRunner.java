package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.FullShirt;
import com.xworkz.encapsulation.things.Shirt;

public class FullShirtRunner {
	public static void main(String[] args) {
		Shirt shirt = new Shirt();
		FullShirt fullShirt = new FullShirt("roadpro", "string", true, "country", 'I', "jagadeesh", "roadster company",
				6654123L);

		System.out.println(shirt.name);
		//System.out.println(shirt.fullShirt);
		System.out.println(fullShirt.getBrand());
		System.out.println(fullShirt.getPrice());
		System.out.println(fullShirt.getQuantity());

		shirt.wearIt();

	}

}
