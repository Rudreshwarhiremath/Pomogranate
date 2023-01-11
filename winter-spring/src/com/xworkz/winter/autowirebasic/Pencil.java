package com.xworkz.winter.autowirebasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("nameOfPencil")
	private String name;
	@Autowired
	private String type;
	@Autowired
	private double price;
	@Autowired
	private String color;
	@Autowired
	private boolean sharp;
	@Autowired
	private boolean stolen;

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

}
