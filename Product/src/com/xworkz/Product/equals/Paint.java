package com.xworkz.Product.equals;

public class Paint {
	private String name;
	private double quantity;
	private String color;
	private String brand;
	private double price;
	private boolean waterproof;
	private boolean dustproof;
	private String quality;
	private String type;
	private String location;

	public Paint() {

	}

	public Paint(String name, double quantity, String color, String brand, double price, boolean waterproof,
			boolean dustproof, String quality, String type, String location) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.waterproof = waterproof;
		this.dustproof = dustproof;
		this.quality = quality;
		this.type = type;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Paint [name=" + name + ", quantity=" + quantity + ", color=" + color + ", brand=" + brand + ", price="
				+ price + ", waterproof=" + waterproof + ", dustproof=" + dustproof + ", quality=" + quality + ", type="
				+ type + ", location=" + location + "]";
	}

	public boolean equals(Object other) {
		System.out.println("Running equals method in paint");
		if (other instanceof Paint) {
			System.out.println("other is paint can check");
			Paint casted = (Paint) other;
			if (this.brand.equals(casted.brand)) {
				System.out.println("brand is same");
				return true;
			} else {
				System.err.println("Other is not paint canot check the properties");
			}
			return false;
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isWaterproof() {
		return waterproof;
	}

	public void setWaterproof(boolean waterproof) {
		this.waterproof = waterproof;
	}

	public boolean isDustproof() {
		return dustproof;
	}

	public void setDustproof(boolean dustproof) {
		this.dustproof = dustproof;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
