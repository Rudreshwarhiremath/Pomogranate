package com.xworkz.winter.thing.vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Newspaper {
	@Autowired
	private String id;
	private String name;
	private String ownerName;
	@Autowired
	private String langauge;
	private Double price;

//	public Newspaper() {
//		System.out.println("default constructer in newspaper");
//	}

	//@Autowired
	public Newspaper(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Newspaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", langauge=" + langauge
				+ ", price=" + price + "]";
	}

	@Autowired
	public void setPrice(Double price) {
		this.price = price;
	}

}
