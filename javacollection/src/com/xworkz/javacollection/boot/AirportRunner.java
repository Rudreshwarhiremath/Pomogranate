package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.javacollection.dto.AirportDto;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDto airport1=new AirportDto("Kempegouda","Bangalore", "International");
		AirportDto airport2=new AirportDto("Bidar Air Force","Bidar", "National");
		AirportDto airport3=new AirportDto("Rajiva Gandhi","Hydrabad", "International");
		AirportDto airport4=new AirportDto("Pune air force","Pune", "International");
		AirportDto airport5=new AirportDto("Kempegouda","Bangalore", "International");
		
		Collection<AirportDto> airport=new ArrayList<AirportDto>();
		airport.add(airport5);
		airport.add(airport4);
		airport.add(airport3);
		airport.add(airport2);
		airport.add(airport1);
		
		boolean equals1=airport.contains(airport1);
		System.out.println("Contain result :"+equals1);
		System.out.println(airport1);
		System.out.println(System.lineSeparator());
		boolean equals2=airport.contains(airport2);
		System.out.println("Contain result :"+equals2);	
		System.out.println(airport2);


	}

}
