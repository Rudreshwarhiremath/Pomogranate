package com.xworkz.bakery.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bakery")
public class BakeryDTO {
	@Column(name="name")
	private String bakeryName;
	@Column(name="bakeryOwnerName")
	private String bakeryOwnerName;
	@Column(name="wife")
	private String bakeryOwnerWifeName;
	private Boolean bakeryOwnerMarride;
	@Column(name="famous")
	private String bakeryFamousFor;
	@Column(name="since")
	private String bakerySince;

}
