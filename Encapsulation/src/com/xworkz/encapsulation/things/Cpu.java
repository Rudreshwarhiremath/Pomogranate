package com.xworkz.encapsulation.things;

public class Cpu {
	Computer comp = new Computer();

	public void show() {

		comp.setSets(6);
		comp.setInputs(15);
		comp.setOutputs(5);
		comp.setName("LG");
		comp.setColour("White");
		comp.setRate(9999);
		comp.setCoverArea(20);
		comp.setLocation("Office");
		comp.setOwner("Siddu");
		comp.setNice(true);
		comp.setBrand(true);
		System.out.println(comp.getSets());
		System.out.println(comp.getInputs());
		System.out.println(comp.getOutputs());
		System.out.println(comp.getName());
		System.out.println(comp.getColour());
		System.out.println(comp.getRate());
		System.out.println(comp.getCoverArea());
		System.out.println(comp.getLocation());
		System.out.println(comp.getOwner());
		System.out.println(comp.isNice());
		System.out.println(comp.isBrand());

	}

}
