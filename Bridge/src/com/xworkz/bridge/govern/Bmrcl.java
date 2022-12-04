package com.xworkz.bridge.govern;

import com.xworkz.bridge.rules.MetroRules;

public class Bmrcl {
	private MetroRules metroRules;
	
	
	public Bmrcl() {
		
	}
	public Bmrcl(MetroRules metroRules) {
		this.metroRules=metroRules;
	}
	public void train() {
		if(this.metroRules != null) {
			System.out.println("running the train in metro");
			boolean issue=this.metroRules.ticket();
			int ticket=this.metroRules.ticketPrice();
			if(issue == true && ticket>=10) {
				System.out.println("Bmrcl is following rules ");
			}else {
				System.out.println("Bmrcl is not fallowing");
			}
		}
	}

}
