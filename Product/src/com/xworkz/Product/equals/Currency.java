package com.xworkz.Product.equals;

public class Currency {
	private String country;
	private String name;
	private double value;
	private String country1;
	private String name1;
	private double value1;
	private String country2;
	private String name2;
	private double value2;
	private double indianRuppe;

	public Currency(String country, String name, double value, String country1, String name1, double value1,
			String country2, String name2, double value2, double indianRuppe) {
		super();
		this.country = country;
		this.name = name;
		this.value = value;
		this.country1 = country1;
		this.name1 = name1;
		this.value1 = value1;
		this.country2 = country2;
		this.name2 = name2;
		this.value2 = value2;
		this.indianRuppe = indianRuppe;
	}

	@Override
	public String toString() {
		return "Currency [country=" + country + ", name=" + name + ", value=" + value + ", country1=" + country1
				+ ", name1=" + name1 + ", value1=" + value1 + ", country2=" + country2 + ", name2=" + name2
				+ ", value2=" + value2 + ", indianRuppe=" + indianRuppe + "]";
	}

	@Override
	public boolean equals(Object others) {
		if (others instanceof Currency) {
			System.out.println("Check the same properties");
			Currency casted = (Currency) others;
			if (this.country.equals(casted.country) && (this.name.equals(casted.name)
					&& (this.country1.equals(casted.country1) && (this.name1.equals(casted.name1))))) {
				System.out.println("Condition is true");
				return true;
			} else {
				System.err.println("Condition is false");
			}
			return false;
		}
		return false;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getCountry1() {
		return country1;
	}

	public void setCountry1(String country1) {
		this.country1 = country1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public String getCountry2() {
		return country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public double getValue2() {
		return value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

	public double getIndianRuppe() {
		return indianRuppe;
	}

	public void setIndianRuppe(double indianRuppe) {
		this.indianRuppe = indianRuppe;
	}

}
