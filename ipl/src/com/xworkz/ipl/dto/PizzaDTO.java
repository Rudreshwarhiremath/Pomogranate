package com.xworkz.ipl.dto;

import com.xworkz.ipl.constant.PizzaSize;

public class PizzaDTO extends AbstractAuditDtoPizza{
	private String name;
	private String compnay;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	private String flavour;
	private String type;
	
	public PizzaDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", compnay=" + compnay + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", flavour=" + flavour + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompnay() {
		return compnay;
	}

	public void setCompnay(String compnay) {
		this.compnay = compnay;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
