package com.xworkz.BMTC.Mysore;

import com.xworkz.BMTC.banglore.DistrictCollecter;

public class DistrictCollecterRunner {

	public static void main(String[] args) {
		DistrictCollecter colect = new DistrictCollecter();
		DistrictCollecter no = new DistrictCollecter();
		DistrictCollecter city = new DistrictCollecter();
		DistrictCollecter batno = new DistrictCollecter();
		System.out.println(colect.name);
		System.out.println(no.age);
		System.out.println(city.district);
		System.out.println(batno.batchNo);
		colect.name = "Harshvardhan";
		no.age = 45;
		city.district = "Bidar";
		batno.batchNo = 80889845;
		System.out.println(colect.name);
		System.out.println(no.age);
		System.out.println(city.district);
		System.out.println(batno.batchNo);

	}

}
