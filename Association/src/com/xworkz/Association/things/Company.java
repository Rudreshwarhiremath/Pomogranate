package com.xworkz.Association.things;

public class Company {
	public String name;
	public String ownerName;
	public Location location;

	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	 public void setLocation(Location location) {
		 this.location=location;
	}

	public void show() {
		System.out.println("Compnay name:" + name);
		System.out.println("ownerName:" + ownerName);
		if (this.location != null) {
			// System.out.println(this.location);
			this.location.show();
		}
	}

}
