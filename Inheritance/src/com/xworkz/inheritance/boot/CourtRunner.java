package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Court;
import com.xworkz.inheritance.things.child.*;

public class CourtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Court cort = new Court();
		HighCourt high = new HighCourt();
		SuprimeCourt suprim = new SuprimeCourt();
		DistrictCourt dist = new DistrictCourt();

		Court car = (Court) high;
		Court drive = (Court) suprim;
		Court drum = (Court) dist;

		cort.show();
		System.out.println("Court +++++++++++++++++ ");
		high.show();
		System.out.println("High Court +++++++++++++ ");
		suprim.show();
		System.out.println("Suprim Court ++++++++++++");
		dist.show();
		System.out.println("District Court +++++++++++++");
		System.out.println("Casting process >>>>>>>>>>>>>>>>>>>>>");
		car.show();
		drive.show();
		drum.show();

	}

}
