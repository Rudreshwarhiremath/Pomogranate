package com.xworkz.TeaTime.Kalburgi;

public class Textile {
	public String shopName;
	public String ownerName;
	public long mobileNo;
	public String location;
	public double area;
	public int childrens;
	public String shopColour;

	public Textile() {

	}

	public Textile(String shopName, String ownerName) {
		this();
		this.shopName = shopName;
		this.ownerName = ownerName;
	}

	public Textile(long mobileNo, String location) {
		this("Stylesh", "Prashant");
		this.mobileNo = mobileNo;
		this.location = location;
	}

	public Textile(int childrens, String shopColour) {
		this(9845284957L, "Rajajinagar");
		this.childrens = childrens;
		this.shopColour = shopColour;

	}

	public Textile(String shopName) {
		this(2, "yellow/grey");
		this.shopName = shopName;
	}

	public Textile(long mobileNo) {
		this("ravi");
		this.mobileNo = mobileNo;

	}

	public Textile(double area) {
		this(6362587415L);
		this.area = area;

	}

	public Textile(int Childrens) {
		this(252.468);
		this.childrens = childrens;

	}

	public Textile(String shopName, String ownerName, long mobileNo, String location, int childrens,
			String shopColour,double area) {
		this(5);
		this.shopName=shopName;

	}

}
