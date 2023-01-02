package com.xworkz.javacollection.dto;

import java.io.Serializable;

public class AirportDto implements Serializable {
	private String name;
	private String city;
	private String type;

	public AirportDto() {
		// TODO Auto-generated constructor stub
	}

	public AirportDto(String name, String city, String type) {
		super();
		this.name = name;
		this.city = city;
		this.type = type;
	}

	@Override
	public String toString() {
		return "AirportDto [name=" + name + ", city=" + city + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof AirportDto) {
				AirportDto dto = (AirportDto) obj;
				if (dto.type.contains(this.type)) {
					System.out.println("type is matching:" + dto);
					return true;
				} else {
					System.out.println("Type is not matching");
				}
			}
		}
		return false;
	}

}
