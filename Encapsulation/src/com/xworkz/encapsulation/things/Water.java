package com.xworkz.encapsulation.things;

public class Water {
	Kitchen kit = new Kitchen();

	public void show() {
		kit.setChilli("Gharakul");
		kit.setSugur("prasanna");
		kit.setSpicy("mtr");
		kit.setSalt("Tata");
		kit.setMasala("MTR");
		kit.setGas("HP");
		kit.setStow("Pristage");
		kit.setFilter("Kent");
		kit.setTotal(10);
		kit.setGhee("Nandini");
		kit.setOil("Ruchi gold");
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

	}

}
