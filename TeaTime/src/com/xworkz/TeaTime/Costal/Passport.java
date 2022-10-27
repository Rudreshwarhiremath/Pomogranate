package com.xworkz.TeaTime.Costal;

public class Passport {
	public long number;
	public String name;
	public String expiryDate;
	public String country;
	public String issueDate;
	public int noOfleafes;

	public Passport(long number) {
		this.number = number;

	}

	public Passport(String name) {
		this.name = name;
	}

	public Passport(String expiryDate, String issuseDate) {
		this.expiryDate = expiryDate;
		this.issueDate = issuseDate;
	}

	public Passport(String country, String name, String issueDate) {
		this.country = country;
		this.name = name;
		this.issueDate = issueDate;

	}

	public Passport(int noOfleafes) {
		this.noOfleafes = noOfleafes;
	}

	public Passport(long number, int noOfleafes) {
		this.number = number;
		this.noOfleafes = noOfleafes;

	}

	public Passport(int noOfleafes, String name) {
		this.noOfleafes = noOfleafes;
		this.name = name;

	}

	public Passport(long number, String country) {
		this.country = country;
		this.number = number;

	}

}
