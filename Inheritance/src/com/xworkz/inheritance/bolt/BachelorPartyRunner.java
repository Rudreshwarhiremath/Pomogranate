package com.xworkz.inheritance.bolt;

import com.xworkz.inheritance.nut.BachelorParty;
import com.xworkz.inheritance.nut.Party;

public class BachelorPartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BachelorParty party = new BachelorParty(100, "PVC pub", 8);
		System.out.println(party.location);
		System.out.println(party.members);
		System.out.println(party.time);
		Party part = new Party(150, "Pub", 9);
		System.out.println(part.location);
		System.out.println(part.members);
		System.out.println(part.time);

	}

}
