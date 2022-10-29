package com.xworkz.Association.things;

public class Name {
	public String presentName;
	public String specialty;
	public String pastNmae;
	public Name(String presentName, String specialty, String pastNmae) {
		super();
		this.presentName = presentName;
		this.specialty = specialty;
		this.pastNmae = pastNmae;
	}
	public void show1() {
		System.out.println(presentName);
		System.out.println(specialty);
		System.out.println(pastNmae);
	}
	

}
