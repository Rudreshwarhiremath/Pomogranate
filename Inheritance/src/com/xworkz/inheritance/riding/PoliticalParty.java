package com.xworkz.inheritance.riding;

public class PoliticalParty {
	public String abbrivation;
	public String prisedent;

	public PoliticalParty(String abbrivation, String prisedent) {
		super();
		this.abbrivation = abbrivation;
		this.prisedent = prisedent;
	}

	public void display() {
		System.out.println("BJP abbrivation:" + abbrivation);
		System.out.println("BJP Prisedent:" + prisedent);
	}
}
