package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Kitchen;
import com.xworkz.encapsulation.things.Water;

public class KitchenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitchen kit = new Kitchen();
        Water neer=new Water();
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
		neer.show();

	}

}
