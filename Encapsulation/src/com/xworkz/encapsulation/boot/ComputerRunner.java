package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Computer;
import com.xworkz.encapsulation.things.Cpu;

public class ComputerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer();
		Cpu set = new Cpu();
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

		set.show();
	}

}
