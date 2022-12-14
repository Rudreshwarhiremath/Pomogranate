package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class WarDto {
	private String name;
	private LocalDateTime startdate;
	private LocalDateTime enddate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeathes;

	public WarDto() {
		super();
	}

	@Override
	public String toString() {
		return "WarDto [name=" + name + ", startdate=" + startdate + ", enddate=" + enddate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", wonBy=" + wonBy + ", noOfDeathes=" + noOfDeathes + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDateTime i) {
		this.startdate = i;
	}

	public LocalDateTime getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDateTime i) {
		this.enddate = i;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public int getNoOfDeathes() {
		return noOfDeathes;
	}

	public void setNoOfDeathes(int noOfDeathes) {
		this.noOfDeathes = noOfDeathes;
	}

}
