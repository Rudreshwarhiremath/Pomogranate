package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Mahindra;

public class MahindraRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Trucks= {"10tyre","12tyre","Tipper","16tyre"};
		 String[] Cars= {"Thar","XUV700","XUV300","Scorpio","bulero"};
		 String[] Buses= {"miniSchoolbus","SchoolBus","ACBus","etc.....     "};
		 String[] locations= {"Pune","Hosapete","Jahirabad"};
		 String[] variteUses= {"private","Comercial"};
		 String[] varites= {"Trucks","Buses","cars","tractors","EarthMovers"};
		 Mahindra mahi=new Mahindra("Mahindra", "MahindraandMahindra", 50, "BestQuality", 120000, Trucks, Cars, Buses, locations, variteUses, varites);
		 mahi.reading();

	}

}
