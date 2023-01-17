package com.xworkz.crud.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.ToString;
@ToString
public abstract class AbstractAuditdto implements Serializable {
	private String createdBy;
	private LocalDateTime createdTime;
	private String updatedBy;
	private LocalDateTime updatedTime;

}
