package com.xworkz.javacollection.dto;

import java.io.Serializable;

public class PalaceDto implements Serializable {
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private Double visiters;
	
	
	public PalaceDto() {
		// TODO Auto-generated constructor stub
	}


	public PalaceDto(String name, String location, String builtBy, boolean destroyed, Double visiters) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visiters = visiters;
	}


	@Override
	public String toString() {
		return "PalaceDto [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visiters=" + visiters + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getBuiltBy() {
		return builtBy;
	}


	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}


	public boolean isDestroyed() {
		return destroyed;
	}


	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}


	public Double getVisiters() {
		return visiters;
	}


	public void setVisiters(Double visiters) {
		this.visiters = visiters;
	}
	

}
