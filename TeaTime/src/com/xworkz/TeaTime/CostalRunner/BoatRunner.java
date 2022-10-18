package com.xworkz.TeaTime.CostalRunner;

import com.xworkz.TeaTime.Costal.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		Boat boat1 = new Boat(4);
		System.out.println(boat1.type);
		Boat boat2 = new Boat("L&T");
		System.out.println(boat2.companyname);
		Boat boat3 = new Boat(5, "orange");
		System.out.println(boat3.type);
		System.out.println(boat3.colour);
		Boat boat4 = new Boat("Prashant", 4);
		System.out.println(boat4.owner);
		System.out.println(boat4.type);
		Boat boat5 = new Boat("Siddu", "Green");
		System.out.println(boat5.name);
		System.out.println(boat5.colour);
		Boat boat6 = new Boat(7, "Jagadeesh", "white");
		System.out.println(boat6.type);
		System.out.println(boat6.name);
		System.out.println(boat6.colour);
		Boat boat7 = new Boat("mithun", "ParrotGreen", "Rajahuli");
		System.out.println(boat7.owner);
		System.out.println(boat7.colour);
		System.out.println(boat7.name);
		Boat boat8 = new Boat("Ramachari", "Pink", "TATA", 9, "RatanTATA");
		System.out.println(boat8.name);
		System.out.println(boat8.colour);
		System.out.println(boat8.companyname);
		System.out.println(boat8.type);
		System.out.println(boat8.owner);

	}

}
