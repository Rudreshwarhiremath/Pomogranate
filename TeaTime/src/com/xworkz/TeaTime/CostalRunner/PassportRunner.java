package com.xworkz.TeaTime.CostalRunner;

import com.xworkz.TeaTime.Costal.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		Passport passport = new Passport(5);
		System.out.println(passport.noOfleafes);
		Passport passport1 = new Passport(7802033l);
		System.out.println(passport1.number);
		Passport passport2 = new Passport("Aishwarya rai");
		System.out.println(passport2.name);
		Passport passport3 = new Passport(5, "Aishwarya rai");
		System.out.println(passport3.name);
		System.out.println(passport3.noOfleafes);
		Passport passport4 = new Passport(78020331, 5);
		System.out.println(passport4.number);
		System.out.println(passport4.noOfleafes);
		Passport passport5 = new Passport(78020331, "india");
		System.out.println(passport5.number);
		System.out.println(passport5.name);
		Passport passport6 = new Passport("01/05/2016", "02/05/2006");
		System.out.println(passport6.issueDate);
		System.out.println(passport6.expiryDate);
		Passport passport7 = new Passport("india", "Prashant", "10/10/2022");
		System.out.println(passport7.country);
		System.out.println(passport7.name);
		System.out.println(passport7.issueDate);

	}

}
