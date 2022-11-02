package com.xworkz.encapsulation.things;

public class Eat {
	Kitchen kit = new Kitchen();

	public void show() {
		kit.setChilli("Edli");
		kit.setSugur("vada");
		kit.setSpicy("masalaDosa");
		kit.setSalt("setdosa");
		kit.setMasala("khalidosa");
		kit.setGas("kharabath");
		kit.setStow("palav");
		kit.setFilter("samber");
		kit.setTotal(10);
		kit.setGhee("chatni");
		kit.setOil("raita");
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
