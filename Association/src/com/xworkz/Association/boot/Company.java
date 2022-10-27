package com.xworkz.Association.boot;

public class Company {
	public String name;
	public String type;
	
	
	public Company(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public void show() {
		System.out.println(name);
		System.out.println(type);
	}
	

}
