package com.xworkz.lake.dto;

public class placeDto extends AbstractAuditDTO {
	private String name;
	private String famousFor;
	private Double distance;
	private Double expenditure;
	private String city;
	
	public placeDto() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(Double expenditure) {
		this.expenditure = expenditure;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public placeDto(String name, String famousFor, Double distance, Double expenditure, String city) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.distance = distance;
		this.expenditure = expenditure;
		this.city = city;
	}

	@Override
	public String toString() {
		return "placeDto [name=" + name + ", famousFor=" + famousFor + ", distance=" + distance + ", expenditure="
				+ expenditure + ", city=" + city + ", toString()=" + super.toString() + "]";
	}

}
