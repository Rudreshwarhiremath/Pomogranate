package com.xworkz.inheritance.bolt;

import com.xworkz.inheritance.nut.Fashion;
import com.xworkz.inheritance.nut.PreWeddingShoot;

public class PreWeddingShootRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreWeddingShoot shoot = new PreWeddingShoot("Beach", "canon", "Pavan");
		System.out.println(shoot.camera);
		System.out.println(shoot.cameraman);
		System.out.println(shoot.location);
		Fashion fash = new Fashion("Murudeshwar", "Knion", "Basava");
		System.out.println(fash.camera);
		System.out.println(fash.cameraman);
		System.out.println(fash.location);

	}

}
