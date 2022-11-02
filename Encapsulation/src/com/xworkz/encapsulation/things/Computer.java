package com.xworkz.encapsulation.things;

public class Computer {
	private String name;
	private String colour;
	private int rate;
	private int sets;
	private double coverArea;
	private int inputs;
	private String location;
	private String owner;
	private int outputs;
	private boolean nice;
	private boolean brand;

	public int getSets() {
		return sets;
	}

	void setSets(int sets) {
		this.sets = sets;
	}

	public int getInputs() {
		return inputs;
	}

	void setInputs(int inputs) {
		this.inputs = inputs;
	}

	public int getOutputs() {
		return outputs;
	}

	void setOutputs(int outputs) {
		this.outputs = outputs;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	public int getRate() {
		return rate;
	}

	void setRate(int rate) {
		this.rate = rate;
	}

	public double getCoverArea() {
		return coverArea;
	}

	void setCoverArea(double coverArea) {
		this.coverArea = coverArea;
	}

	public String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean isNice() {
		return nice;
	}

	void setNice(boolean nice) {
		this.nice = nice;
	}

	public boolean isBrand() {
		return brand;
	}

	void setBrand(boolean brand) {
		this.brand = brand;
	}
}
