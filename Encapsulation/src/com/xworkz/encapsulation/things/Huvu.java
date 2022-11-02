package com.xworkz.encapsulation.things;

public class Huvu {
	Flower flow = new Flower();

	public void show() {
		flow.setName("Rose");
		flow.setArea(2400);
		flow.setLabers(5);
		flow.setLocation("Rose House");
		flow.setOwner("RaviShatri");
		flow.setWaterrequired(2);
		flow.setNice(true);
		flow.setClaen(true);
		flow.setColour("Red");
		flow.setRate(25);
		flow.setLafes(50);
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
	}

}
