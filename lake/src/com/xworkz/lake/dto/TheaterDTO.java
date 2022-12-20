package com.xworkz.lake.dto;

import com.xworkz.lake.constant.Seates;

public class TheaterDTO extends AbstractAuditDTO {
	 private String id;
	 private String name;
	 private String brand;
	 private Seates seates;
	 
	 public TheaterDTO() {
		// TODO Auto-generated constructor stub
	}

	public TheaterDTO(String id, String name, String brand, Seates seates) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seates = seates;
	}

	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", seates=" + seates + ", toString()="
				+ super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Seates getSeates() {
		return seates;
	}

	public void setSeates(Seates seates) {
		this.seates = seates;
	}
	

}
