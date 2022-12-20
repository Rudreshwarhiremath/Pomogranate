package com.xworkz.lake.dto;

public class BuildingDto extends AbstractAuditDTO {
	private int no;
	private String name;
	private Integer floors;
	private String lift;
	private String parking;
	private String type;

	public BuildingDto() {
		// TODO Auto-generated constructor stub
	}

	public BuildingDto(int no, String name, Integer floors, String lift, String parking, String type) {
		super();
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDto [no=" + no + ", name=" + name + ", floors=" + floors + ", lift=" + lift + ", parking="
				+ parking + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFloors() {
		return floors;
	}

	public void setFloors(Integer floors) {
		this.floors = floors;
	}

	public String getLift() {
		return lift;
	}

	public void setLift(String lift) {
		this.lift = lift;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
