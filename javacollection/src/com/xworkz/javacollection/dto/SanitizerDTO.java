package com.xworkz.javacollection.dto;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {
	private String brand;
	private Double price;
	private String color;
	private Long id;

	public SanitizerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SanitizerDTO(String brand, Double price, String color, Long id) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.id = id;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [brand=" + brand + ", price=" + price + ", color=" + color + ", id=" + id + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
