package com.xworkz.prema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "premigalu")
public class PreamEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_valentineName")
	private String valentineName;
	@Column(name = "p_place")
	private String place;
	@Column(name = "p_gift")
	private String gift;

}
