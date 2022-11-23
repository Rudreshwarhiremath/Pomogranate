package com.xworkz.Product.equals;

public class Makeupkit {
	private String brand;
	private String name;
	private String type;
	private String price;
	private String quality;
	private String location;
	private String mallname;
	private String otherthing;
	private double totalcost;
	private String parlerName;

	public Makeupkit(String brand, String name, String type, String price, String quality, String location,
			String mallname, String otherthing, double totalcost, String parlerName) {
		super();
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quality = quality;
		this.location = location;
		this.mallname = mallname;
		this.otherthing = otherthing;
		this.totalcost = totalcost;
		this.parlerName = parlerName;
	}

	@Override
	public String toString() {
		return "Makeupkit [brand=" + brand + ", name=" + name + ", type=" + type + ", price=" + price + ", quality="
				+ quality + ", location=" + location + ", mallname=" + mallname + ", otherthing=" + otherthing
				+ ", totalcost=" + totalcost + ", parlerName=" + parlerName + "]";
	}

	@Override
	public boolean equals(Object others) {
		if (others instanceof Makeupkit) {
			Makeupkit casted = (Makeupkit) others;
			if (this.brand.equals(casted.brand) && 
				(this.location.equals(casted.location) && 
				(this.mallname.equals(casted.mallname)&& 
				(this.name.equals(casted.name) &&
				(this.otherthing.equals(casted.otherthing) && 
				(this.parlerName.equals(casted.parlerName)&&
				(this.price.equals(casted.price) &&
				(this.quality.equals(casted.quality))))))))) {
				return true;

			} else {
				System.err.println("plz check");
			}
			return false;
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMallname() {
		return mallname;
	}

	public void setMallname(String mallname) {
		this.mallname = mallname;
	}

	public String getOtherthing() {
		return otherthing;
	}

	public void setOtherthing(String otherthing) {
		this.otherthing = otherthing;
	}

	public double getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}

	public String getParlerName() {
		return parlerName;
	}

	public void setParlerName(String parlerName) {
		this.parlerName = parlerName;
	}

}
