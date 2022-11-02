package com.xworkz.encapsulation.things;

public class Travels {
	public String name;
	private String bus1;
	private String bus2 ;
	private String bus3;
	public String owner;
	public String location;
	public String source;
	public String destination;
	public int cost;
	public String driver;
	public String coDriver;
	public String getBus1() {
		return bus1;
	}
	  void setBus1(String bus1) {
		this.bus1 = bus1;
	}
	public String getBus2() {
		return bus2;
	}
	  void setBus2(String bus2) {
		this.bus2 = bus2;
	}
	public String getBus3() {
		return bus3;
	}
	  void setBus3(String bus3) {
		this.bus3 = bus3;
	}
	public Travels(String name, String owner, String location, String source, String destination, int cost,
			String driver, String coDriver) {
		super();
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.source = source;
		this.destination = destination;
		this.cost = cost;
		this.driver = driver;
		this.coDriver = coDriver;
	}
	

}
