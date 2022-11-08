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
		Court court=new HighCourt();
		HighCourt car = (HighCourt) court;
		court.show();
		Court court1=new SuprimeCourt();
		SuprimeCourt drive = (SuprimeCourt) court1;
		court1.show();
		Court court2=new DistrictCourt();
		DistrictCourt drum = (DistrictCourt) court2;
		court2.show();
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
