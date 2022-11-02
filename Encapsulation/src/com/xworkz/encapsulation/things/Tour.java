package com.xworkz.encapsulation.things;

public class Tour {
	Travels travel=new Travels("Saptgiri","Satish","Dhanvantri road","Banglore","Mumbai",999,"Sangamesh","Shivakumar");
	public void show() {
		System.out.println(travel.name);
		System.out.println(travel.owner);
		System.out.println(travel.location);
		System.out.println(travel.source);
		System.out.println(travel.destination);
		System.out.println(travel.cost);
		System.out.println(travel.driver);
		System.out.println(travel.coDriver);
        travel.setBus1("Sathyam");
        travel.setBus2("Shivam");
        travel.setBus3("Sundaram");
		System.out.println(travel.getBus1());
		System.out.println(travel.getBus2());
		System.out.println(travel.getBus3());
	}
	

}
