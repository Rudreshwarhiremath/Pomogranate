package com.xworkz.inheritance.things.child;

import com.xworkz.inheritance.things.Court;

public class HighCourt extends Court {
	public int loyers=50;
	public String judge="Rama Krishana";
	
	public void show() {
		System.out.println(loyers);
		System.out.println(judge);
	}
	

}
