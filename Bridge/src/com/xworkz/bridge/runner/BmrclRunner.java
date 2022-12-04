package com.xworkz.bridge.runner;

import com.xworkz.bridge.fallowers.Passenger;
import com.xworkz.bridge.govern.Bmrcl;
import com.xworkz.bridge.rules.MetroRules;

public class BmrclRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger metro=new Passenger();
		Bmrcl bmrcl=new Bmrcl(metro);
		bmrcl.train();



	}

}
