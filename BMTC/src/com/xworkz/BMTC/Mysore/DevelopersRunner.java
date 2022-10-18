package com.xworkz.BMTC.Mysore;

import com.xworkz.BMTC.banglore.Developers;

public class DevelopersRunner {

	public static void main(String[] args) {
		Developers present = new Developers();
		Developers edu = new Developers();
		Developers surved = new Developers();
		Developers LUCK = new Developers();
		Developers quality = new Developers();
		System.out.println(present.name);
		System.out.println(edu.education);
		System.out.println(surved.experience);
		System.out.println(LUCK.salary);
		System.out.println(quality.company);
		present.name = "Omkar Sir";
		edu.education = "BCA";
		surved.experience = 12;
		LUCK.salary = "30lac";
		quality.company = "US based MNC";
		System.out.println(present.name);
		System.out.println(edu.education);
		System.out.println(surved.experience);
		System.out.println(LUCK.salary);
		System.out.println(quality.company);

	}

}
