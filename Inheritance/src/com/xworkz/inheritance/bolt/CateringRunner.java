package com.xworkz.inheritance.bolt;

import com.xworkz.inheritance.nut.Catering;
import com.xworkz.inheritance.nut.Service;

class CateringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catering serv = new Catering(12, "7:30", 20);
		System.out.println(serv.iteams);
		System.out.println(serv.serevers);
		System.out.println(serv.time);
		Service cat = new Service(10, "7:00", 15);
		System.out.println(cat.iteams);
		System.out.println(cat.serevers);
		System.out.println(cat.time);

	}

}
