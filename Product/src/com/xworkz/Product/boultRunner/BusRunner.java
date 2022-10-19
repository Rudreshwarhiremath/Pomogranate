package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Bus;

public class BusRunner {

	public static void main(String[] args) {
		 String[] Tyreno= {"1076F","1078F","1188R","1187N","5566L","4477L","8888S"};
		 char[] gears= {'1','2','3','4','5','6','R'};
		 String[] controls= {"Staring","breack","clutch","acclater","gearstick","handbreack"};
		 String[] facilities= {"nonAC","airsuspension","Sleeper"};
		 Bus set=new Bus("Satvika", "Ashok Lelyand", 44, "1166", "Basavaraj", Tyreno, gears, controls, facilities);
		 set.reading();

	}

}
