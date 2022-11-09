package com.xworkz.inheritance.riding;

public class Director {
	public String name;
	public String type;

	public Director(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void display() {
		System.out.println("Director name:" + name);
		System.out.println("Director type:" + type);

	}

}
