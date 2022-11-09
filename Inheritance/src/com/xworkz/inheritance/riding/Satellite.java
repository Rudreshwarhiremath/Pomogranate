package com.xworkz.inheritance.riding;

public class Satellite {
	public String type;
	public long distance;
	public Satellite(String type, long distance) {
		super();
		this.type = type;
		this.distance = distance;
	}
	public void show() {
		System.out.println("Moon is a satellite");
		System.out.println("Satellite type:"+type);
		System.out.println("Satellite distance:"+distance+"km");
	}

}
