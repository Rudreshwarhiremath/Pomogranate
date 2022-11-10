package com.xworkz.inheritance.Flames;

public class Kasab extends Terrorist{
	public int age;

	public Kasab(String location, String gun,int age) {
		super("Pakistan","AK47");
		this.age=age;
	}
	public void show() {
		super.show();
		System.out.println(age);
	}
	

}
