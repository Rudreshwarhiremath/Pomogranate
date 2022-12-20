package com.xworkz.lake.dto;

public class RailwayStationDto  extends AbstractAuditDTO{
	private String name;
	private int noOFplatforms;
	private String area;
	private Double platformTicketprice;
	
	
	public RailwayStationDto(String name, int noOFplatforms, String area, Double platformTicketprice) {
		super();
		this.name = name;
		this.noOFplatforms = noOFplatforms;
		this.area = area;
		this.platformTicketprice = platformTicketprice;
	}


	@Override
	public String toString() {
		return "RailwayStation [name=" + name + ", noOFplatforms=" + noOFplatforms + ", area=" + area
				+ ", platformTicketprice=" + platformTicketprice + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOFplatforms() {
		return noOFplatforms;
	}


	public void setNoOFplatforms(int noOFplatforms) {
		this.noOFplatforms = noOFplatforms;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public Double getPlatformTicketprice() {
		return platformTicketprice;
	}


	public void setPlatformTicketprice(Double platformTicketprice) {
		this.platformTicketprice = platformTicketprice;
	}
	
	

}
