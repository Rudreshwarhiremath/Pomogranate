package com.xworkz.bigBasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="BIGBASKET")
public class BibBasketEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "customerMobileNo")
	private String customerMobileNo;
	@Column(name = "userId")
	private String userId;
	@Column(name = "email")
	private String email;
	@Column(name = "pword")
	private String pword;
	@Column(name = "location")
	private String location;
	@Column(name = "customerStreet")
	private String customerStreet;
	@Column(name = "area")
	private String area;
	@Column(name = "item")
	private String item;
	@Column(name = "amount")
	private Double amount;
	

}
