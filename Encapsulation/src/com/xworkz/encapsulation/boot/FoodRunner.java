package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Eat;
import com.xworkz.encapsulation.things.Kitchen;

public class FoodRunner {

	public static void main(String[] args) {
		Kitchen kit = new Kitchen();
		Eat tinnu = new Eat();
		System.out.println(kit.getSalt());
		System.out.println(kit.getMasala());
		System.out.println(kit.getGas());
		System.out.println(kit.getStow());
		System.out.println(kit.getFilter());
		System.out.println(kit.getTotal());
		System.out.println(kit.getGhee());
		System.out.println(kit.getOil());
		System.out.println(kit.getChilli());
		System.out.println(kit.getSugur());
		System.out.println(kit.getSpicy());
		tinnu.show();

	}

}
