package com.xworkz.javacollection.boot;


import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.javacollection.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {
		HotelDTO hotel1=new HotelDTO("A2B", "Bhayasham circle", "veg", 505550L, 25);
		HotelDTO hotel2=new HotelDTO("Kadamba", "ESI ", "veg", 668855L, 24);
		HotelDTO hotel3=new HotelDTO("Udupi", "Udupi Garden", "veg", 889966554, 12);
		HotelDTO hotel4=new HotelDTO("Krishana", "Vijay nagar", "veg", 7789456, 35);
		HotelDTO hotel5=new HotelDTO("Annapoorneshwari", "Ram Mandir", "veg", 12365448L, 50);
		
		Collection<HotelDTO> reff=Stream.of(hotel1,hotel2,hotel3,hotel4,hotel5).collect(Collectors.toList());
		 System.out.println(reff);
		 reff.forEach(ele->System.err.println(ele));
		 System.out.println(System.lineSeparator());
		Comparator<HotelDTO> dto=(p1,p2)->p1.getName().compareTo(p2.getName());
		reff.stream().sorted(dto).forEach(ele->System.out.println(ele));
		System.err.println(dto);
		
		 
		

	}

}
