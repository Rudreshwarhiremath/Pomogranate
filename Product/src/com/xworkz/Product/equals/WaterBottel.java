package com.xworkz.Product.equals;

public class WaterBottel {
	private String name;
	private String brand;
	private String type;
	private char size;
	private double quantity;
	private boolean quality;
	private int price;
	private int wholesaleprice;
	private double proffit;
	private String minerls;

	public WaterBottel(String name, String brand, String type, char size, double quantity, boolean quality, int price,
			int wholesaleprice, double proffit, String minerls) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.quantity = quantity;
		this.quality = quality;
		this.price = price;
		this.wholesaleprice = wholesaleprice;
		this.proffit = proffit;
		this.minerls = minerls;
	}

	@Override
	public String toString() {
		return "WaterBottel [name=" + name + ", brand=" + brand + ", type=" + type + ", size=" + size + ", quantity="
				+ quantity + ", quality=" + quality + ", price=" + price + ", wholesaleprice=" + wholesaleprice
				+ ", proffit=" + proffit + ", minerls=" + minerls + "]";
	}

	@Override
	public boolean equals(Object others) {
		System.out.println("Chcking properties");
		if (others instanceof WaterBottel) {
			System.out.println("checking properties for same");
			WaterBottel casted = (WaterBottel) others;
			if (this.name.equals(casted.name) && (this.brand.equals(casted.brand) && (this.type.equals(casted.type)))) {
				System.out.println("its true can continue");
				return true;
			} else {
			System.out.println("not matching come out");
		}
		return false;
	}return false;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWholesaleprice() {
		return wholesaleprice;
	}

	public void setWholesaleprice(int wholesaleprice) {
		this.wholesaleprice = wholesaleprice;
	}

	public double getProffit() {
		return proffit;
	}

	public void setProffit(double proffit) {
		this.proffit = proffit;
	}

	public String getMinerls() {
		return minerls;
	}

	public void setMinerls(String minerls) {
		this.minerls = minerls;
	}

}
