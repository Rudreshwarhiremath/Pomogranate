package com.xworkz.inheritance.bolt;

import com.xworkz.inheritance.nut.DJ;
import com.xworkz.inheritance.nut.SoundSystem;

public class DJRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DJ dj = new DJ("Sri Sai", 15000, "Pavan");
		System.out.println(dj.amount);
		System.out.println(dj.name);
		System.out.println(dj.owner);
		SoundSystem sound = new SoundSystem("Sri Balaji", 20000, "Basavaraj");
		System.out.println(sound.amount);
		System.out.println(sound.name);
		System.out.println(sound.owner);

	}

}
