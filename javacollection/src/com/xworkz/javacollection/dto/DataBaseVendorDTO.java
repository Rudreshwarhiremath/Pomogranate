package com.xworkz.javacollection.dto;

import com.xworkz.javacollection.constant.Type;

public class DataBaseVendorDTO {
	private String name;
	private String developedBy;
	private double size;
	private double licenseCost;
	private Type type;
	
	
	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}


	public DataBaseVendorDTO(String name, String developedBy, double size, double licenseCost, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenseCost = licenseCost;
		this.type = type;
	}


	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenseCost="
				+ licenseCost + ", type=" + type + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public double getLicenseCost() {
		return licenseCost;
	}


	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}
	
}
