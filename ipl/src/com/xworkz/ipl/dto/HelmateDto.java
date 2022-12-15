package com.xworkz.ipl.dto;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.HelmateSize;

public class HelmateDto extends AbstractAuditDto {
	
	private String brand;
	private Color color;
	private HelmateSize size;
	private Double price;
	
	public HelmateDto() {
		System.out.println("No argument constucter in DTO");
	}

	public HelmateDto(String brand, Color color, HelmateSize size, Double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "HelmateDto [brand=" + brand + ", color=" + color + ", size=" + size + ", price=" + price
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public HelmateSize getSize() {
		return size;
	}

	public void setSize(HelmateSize size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
