package com.xworkz.inheritance.things.child;

import com.xworkz.inheritance.things.Court;

public class SuprimeCourt extends Court {
	public String location="Banagaluru";
	public String judge="Krishanppa";
	
	public void show() {
		System.out.println(location);
		System.out.println(judge);
	}
	

}
