package com.xworkz.encapsulation.things;

public class Oilpack {
	Oil pack = new Oil();

	public void show() {

		pack.setRate(120);
		pack.setType(6);
		pack.setLiters(15);
		pack.setName("Sunpure");
		pack.setBrand("gold");
		pack.setPacktype("bottel");
		pack.setLocation("Rajajinagar");
		pack.setOwner("Sathya");
		pack.setLaburs(500);
		pack.setNice(true);
		pack.setTeaste(true);
		System.out.println(pack.getRate());
		System.out.println(pack.getLiters());
		System.out.println(pack.getType());
		System.out.println(pack.getName());
		System.out.println(pack.getBrand());
		System.out.println(pack.getPacktype());
		System.out.println(pack.getLocation());
		System.out.println(pack.getOwner());
		System.out.println(pack.getLaburs());
		System.out.println(pack.isNice());
		System.out.println(pack.isTeaste());

	}

}
