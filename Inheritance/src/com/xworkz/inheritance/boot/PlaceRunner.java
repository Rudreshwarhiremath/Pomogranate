package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.*;

public class PlaceRunner {

	public static void main(String[] args) {
		Bengluru ben1 = new Bengluru();
		SilicanCity ben2 = new Bengluru();
		MetroCity ben3 = new Bengluru();
		City ben4 = new Bengluru();
		Capital ben5 = new Bengluru();
		Place ben6 = new Bengluru();
		Object ben7 = new Bengluru();

		SilicanCity silic1 = new SilicanCity();
		MetroCity silic2 = new SilicanCity();
		City silic3 = new SilicanCity();
		Capital silic4 = new SilicanCity();
		Place silic5 = new SilicanCity();
		Object silic6 = new SilicanCity();

		MetroCity metro1 = new MetroCity();
		City metro2 = new MetroCity();
		Capital metro3 = new MetroCity();
		Place metro4 = new MetroCity();
		Object metro5 = new MetroCity();

		City city1 = new City();
		Capital city2 = new City();
		Place city3 = new City();
		Object city4 = new City();

		Capital capti1 = new Capital();
		Place capti2 = new Capital();
		Object capti3 = new Capital();

		Place place1 = new Place();
		Object place2 = new Place();

		ben1.showoff();
		ben2.disply();
		ben3.show();
		ben4.set();
		ben5.see();
		ben6.set();
		System.out.println("+++++++++++");

		silic1.disply();
		silic2.show();
		silic3.set();
		silic4.see();
		silic5.set();
		System.out.println("------------");

		metro1.show();
		metro2.set();
		metro3.see();
		metro4.set();
		System.out.println("============");

		city1.set();
		city2.see();
		city3.set();
		System.out.println("****************");

		capti1.see();
		capti2.set();
		System.out.println("<<<<<<<<<<<<");

		place1.set();
		System.out.println(">>>>>>>>>>>>>");
		System.out.println("$$$$$$$$$$$$$$$$$$");
		ben1.showoff();
		System.out.println("$$$$$$$$$$$$$$$$$$");

	}

}
