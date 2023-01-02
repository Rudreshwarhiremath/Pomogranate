package com.xworkz.javacollection.dto;

public class ApplicatioDto {
	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;

	
	public ApplicatioDto() {
		// TODO Auto-generated constructor stub
	}


	public ApplicatioDto(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}


	@Override
	public String toString() {
		return "ApplicatioDto [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public boolean isFree() {
		return free;
	}


	public void setFree(boolean free) {
		this.free = free;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
