package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Tour;
import com.xworkz.encapsulation.things.Travels;

public class TravelsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travels travel=new Travels("Saptgiri","Satish","Dhanvantri road","Banglore","Mumbai",999,"Sangamesh","Shivakumar");
		System.out.println(travel.getBus1());
		System.out.println(travel.getBus2());
		System.out.println(travel.getBus3());
		Tour travels=new Tour();
		travels.show();
		

	}

}
