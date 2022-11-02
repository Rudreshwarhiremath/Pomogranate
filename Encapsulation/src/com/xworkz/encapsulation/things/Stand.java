package com.xworkz.encapsulation.things;

public class Stand {
	public String name = "Rama Rajya";
	public BusStand bus = new BusStand();

	public void ping() {
		System.out.println(this.name);
		bus.setName("Darabendre");
		bus.setCity("Dharawad");
		bus.setRoutes(450);
		bus.setBusses(850);
		bus.setArea(4500);
		bus.setDepots(10);
		bus.setNearCity("Hubballi");
		bus.setMananger("Durga Shankar");
		bus.setStaffes(1500);
		bus.setChairs(100);
		bus.setClaen(true);
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

	}

}
