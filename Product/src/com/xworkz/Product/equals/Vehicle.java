package com.xworkz.Product.equals;

public class Vehicle {
	private String name;
	private String type;
	private String brand;
	private double capacity;
	private int seat;
	private String modle;
	private String location;
	private String owner;
	private int age;
	private String number;

	public Vehicle(String name, String type, String brand, double capacity, int seat, String modle, String location,
			String owner, int age, String number) {
		super();
		this.name = name;
		this.type = type;
		this.brand = brand;
		this.capacity = capacity;
		this.seat = seat;
		this.modle = modle;
		this.location = location;
		this.owner = owner;
		this.age = age;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", brand=" + brand + ", capacity=" + capacity + ", seat="
				+ seat + ", modle=" + modle + ", location=" + location + ", owner=" + owner + ", age=" + age
				+ ", number=" + number + "]";
	}

	@Override
	public boolean equals(Object others) {
		System.out.println("Running equals method in vehicale");
		if (others instanceof Vehicle) {
			System.out.println("Others is Vehicle can check");
			Vehicle casted = (Vehicle) others;
			if (this.brand.equals(casted.brand) && (this.location.equals(casted.location))) {
				System.out.println("Both are same");
				return true;
			
		} else {
			System.out.println("Canot match");
			
		}return false;
		
	}return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getModle() {
		return modle;
	}

	public void setModle(String modle) {
		this.modle = modle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
