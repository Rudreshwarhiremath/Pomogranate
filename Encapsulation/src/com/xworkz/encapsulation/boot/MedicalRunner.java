package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Medical;
import com.xworkz.encapsulation.things.Medip;

public class MedicalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medical mob = new Medical();
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
		Medip meb = new Medip();
		meb.show();

	}

}
