package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuditDto implements Serializable {

	private String createdBy;
	private LocalDateTime createdDate;
	private String update;
	private LocalDateTime updatedDate;

	public AbstractAuditDto() {
		super();
	}

	@Override
	public String toString() {
		return "AbstractAuditDto [createdBy=" + createdBy + ", createdDate=" + createdDate + ", update=" + update
				+ ", updatedDate=" + updatedDate + "]";
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
