package com.xworkz.inheritance.riding;

public class Criminal {
	public String name;
	public String type;

	public Criminal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void display() {
		System.out.println("Criminal name:" + name);
		System.out.println("Criminal type:" + type);
	}

}
