package com.xworkz.inheritance.riding;

public class Moon extends Satellite{
	public String shape;

	public Moon(String type, long distance,String shape) {
		super("Natural",384400L);
		this.shape=shape;
	}
	public void display() {
		super.show();
		System.out.println("Moon shape:"+shape);
	}

}
