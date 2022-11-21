package com.xworkz.Association.things;

public class Address {
	public Location location;

	public Address() {
		super();
	}
	 public void setLocation(Location location) {
		 this.location=location;
	 }
	 public void show() {
		 if(this.location!=null) {
			 this.location.show();
		 }
	 }

}
