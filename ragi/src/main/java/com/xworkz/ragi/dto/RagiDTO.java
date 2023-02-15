package com.xworkz.ragi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ragitene")
public class RagiDTO {
	@Column(name = "id")
	@Id
	private int id;
	@Column(name = "hotelName")
	private String hotelName;
	@Column(name = "dishName")
	private String dishName;
	@Column(name = "type")
	private String type;
	@Column(name = "price")
	private Double price;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "takeAway")
	private Boolean takeAway;

}
