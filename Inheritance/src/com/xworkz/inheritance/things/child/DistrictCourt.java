package com.xworkz.inheritance.things.child;

import com.xworkz.inheritance.things.Court;

public class DistrictCourt extends Court {
	public String name="Jilla court";
	public long number=1800450627L;
	
	public void show() {
		System.out.println(name);
		System.out.println(number);
	}

}
