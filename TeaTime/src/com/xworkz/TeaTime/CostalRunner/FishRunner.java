package com.xworkz.TeaTime.CostalRunner;

import com.xworkz.TeaTime.Costal.Fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish fish = new Fish("Tuna", "eadable", 50, 300, 20.4);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		Fish fish1 = new Fish(60);
		System.out.println(fish1.price);
		Fish fish2 = new Fish(200, 15.60);
		System.out.println(fish2.weight);
		System.out.println(fish2.length);
		Fish fish3 = new Fish(30.4, 100);
		System.out.println(fish3.price);
		System.out.println(fish3.length);
		Fish fish4 = new Fish(250.4, "Herring");
		System.out.println(fish4.type);
		System.out.println(fish4.weight);
		Fish fish5=new Fish(555, "Cod");
		System.out.println(fish5.price);
		System.out.println(fish5.name);
		Fish fish6=new Fish("Sardness", 350);
		System.out.println(fish6.weight);
		System.out.println(fish6.name);
		Fish fish7=new Fish("Herring", "eadible");
		System.out.println(fish7.name);
		System.out.println(fish7.type);

	}

}
