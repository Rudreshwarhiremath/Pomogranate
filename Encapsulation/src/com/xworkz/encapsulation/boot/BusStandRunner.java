package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.BusStand;
import com.xworkz.encapsulation.things.Stand;

public class BusStandRunner {

	public static void main(String[] args) {
		
		BusStand bus=new BusStand();
		Stand sot=new Stand();
        System.out.println(bus.getName());
        System.out.println(bus.getCity());
        System.out.println(bus.getRoutes());
        System.out.println(bus.getRoutes());
        System.out.println(bus.getBusses());
        System.out.println(bus.getArea());
        System.out.println(bus.getDepots());
        System.out.println(bus.getNearCity());
        System.out.println(bus.getMananger());
        System.out.println(bus.getStaffes());
        System.out.println(bus.getChairs());
        System.out.println(bus.isClaen());
		sot.ping();
		
		

	}

}
