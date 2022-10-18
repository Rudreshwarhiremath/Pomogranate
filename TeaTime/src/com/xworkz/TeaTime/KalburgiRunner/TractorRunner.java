package com.xworkz.TeaTime.KalburgiRunner;

import com.xworkz.TeaTime.Kalburgi.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		Tractor tractor = new Tractor();
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		System.out.println(tractor.colour);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
		Tractor tractor2 = new Tractor("Mahindra555");
		System.out.println(tractor2.name);

		Tractor tractor3 = new Tractor("Sonalika DI 65", "SONALIKA");
		System.out.println(tractor3.name);
		System.out.println(tractor3.brand);
		;
		Tractor tractor4 = new Tractor("JohnDeer5050D", "JohnDeer", 900000L);
		System.out.println(tractor4.name);
		System.out.println(tractor4.brand);
		System.out.println(tractor4.price);
		Tractor tractor5 = new Tractor("Kubota2428", "Kubota", 550000L, "Orange");
		System.out.println(tractor5.name);
		System.out.println(tractor5.brand);
		System.out.println(tractor5.price);
		System.out.println(tractor5.colour);
		Tractor tractor6 = new Tractor("Newhoolyand410", "Newhoolyand", 1200000L, "Blue", 50);
		System.out.println(tractor6.name);
		System.out.println(tractor6.brand);
		System.out.println(tractor6.price);
		System.out.println(tractor6.colour);
		System.out.println(tractor6.hp);
		Tractor tractor7 = new Tractor("HMT5911", "HMT", 9000000L, "Yellow/Red", 60, "1159");
		System.out.println(tractor7.name);
		System.out.println(tractor7.brand);
		System.out.println(tractor7.price);
		System.out.println(tractor7.colour);
		System.out.println(tractor7.hp);
		System.out.println(tractor7.model);

	}

}
