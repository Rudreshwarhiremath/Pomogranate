package com.xworkz.encapsulation.things;

public class Medip {
	Medical mob = new Medical();

	public void show() {
		mob.setName("Cinarest");
		mob.setUse("Fever");
		mob.setRate(120);
		mob.setQuantity(10);
		mob.setName2("Zintac");
		mob.setUse2("Stomch");
		mob.setRate2(20);
		mob.setQuantity2(5);
		mob.setSyrp("Caff");
		mob.setQuantity3(50);
		mob.setUse3("Caff,cold");
		mob.setLiked(true);
		mob.setTotal(250);
		System.out.println(mob.getName());
		System.out.println(mob.getUse());
		System.out.println(mob.getRate());
		System.out.println(mob.getQuantity());
		System.out.println(mob.getName2());
		System.out.println(mob.getUse2());
		System.out.println(mob.getRate2());
		System.out.println(mob.getQuantity2());
		System.out.println(mob.getSyrp());
		System.out.println(mob.getQuantity3());
		System.out.println(mob.getUse3());
		System.out.println(mob.isLiked());
		System.out.println(mob.getTotal());

	}

}
