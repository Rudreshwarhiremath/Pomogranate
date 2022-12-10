package com.xworkz.crud.boot;

import com.xworkz.crud.implimentres.PancardRepositeryImpl;
import com.xworkz.crud.repository.PancardRepositery;

public class PancardRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PancardRepositery pancardRepositery=new PancardRepositeryImpl();
		pancardRepositery.number("Dqzpr12345");
		pancardRepositery.number("Dzxuyte252624");
		pancardRepositery.number("Vinmsp25741");
		pancardRepositery.number("Odcxys326598");
		//pancardRepositery.number("Dqxyz587694");
		//pancardRepositery.number("Fqnsp85967");
		
		System.out.println(pancardRepositery.total());

	}

}
