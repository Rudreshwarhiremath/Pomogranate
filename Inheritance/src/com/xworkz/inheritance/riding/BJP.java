package com.xworkz.inheritance.riding;

public class BJP extends PoliticalParty {
	public String strongleader;

	public BJP(String abbrivation, String prisedent, String strongleader) {
		super("Bharatiya Janata Party", "J P Nadda");
		this.strongleader = strongleader;
	}

	public void display() {
		super.display();
		System.out.println("Strong Leader:"+strongleader);
	}

}
