package com.xworkz.bridge.runner;

import com.xworkz.bridge.fallowers.Couples;

public class CouplesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Couples get = new Couples();
		get.age();

		get.parentsAgree();
		get.shopping();
		get.satisfy();
		System.out.println(get.couples());

	}

}
