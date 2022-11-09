package com.xworkz.inheritance.riding;

public class Ravi extends Criminal {
	public int murders;
	
	public Ravi(String name, String type,int murders) {
		super("Sachin","PUBG");
		this.murders=murders;
	}
	public void display() {
		super.display();
		System.out.println("Murders:"+murders);
	}
	

	

}
