package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAudiDto implements Serializable {

	private String createdBy;
	private LocalDateTime createdDate;
	private String update;
	private LocalDateTime updatedDate;

	public AbstractAudiDto() {
		super();
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public void display() {
		System.out.println(getCreatedBy());
		System.out.println(getCreatedDate());
	}

}
