package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Flower;
import com.xworkz.encapsulation.things.Huvu;

public class FlowerRunner {
	public static void main(String[] args) {
		Flower flow=new Flower();
		Huvu ha=new Huvu();
		System.out.println(flow.getName());
		System.out.println(flow.getArea());
		System.out.println(flow.getLabers());
		System.out.println(flow.getLocation());
		System.out.println(flow.getOwner());
		System.out.println(flow.getWaterrequired());
		System.out.println(flow.isNice());
		System.out.println(flow.isClaen());
		System.out.println(flow.getColour());
		System.out.println(flow.getRate());
		System.out.println(flow.getLafes());
		ha.show();
	}

}
