package com.xworkz.inheritance.bolt;

import com.xworkz.inheritance.nut.Dowry;
import com.xworkz.inheritance.nut.Gift;

public class DowryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dowry dor = new Dowry(1200000, 12, true);
		System.out.println(dor.amount);
		System.out.println(dor.gave);
		System.out.println(dor.gold);
		Gift gif = new Gift(1500000, 24, true);
		System.out.println(gif.amount);
		System.out.println(gif.gave);
		System.out.println(gif.gold);

	}

}
