package com.xworkz.bigBasket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigbasketDTO {
	@NotNull
	@Size(min = 3,max = 20,message = "customerName should be max 20 and min 3")
	private String customerName;
	@NotNull
	@Size(min = 3,max = 20,message = "customerMobileNo should be max 20 and min 3")
	private String customerMobileNo;
	@NotNull
	@Size(min = 3,max = 20,message = "userId should be max 20 and min 3")
	private String userId;
	@NotNull
	@Size(min = 3,max = 50,message = "email should be max 20 and min 3")
	private String email;
	//@NotNull
	//@Size(min = 3,max = 20,message = "password should be max 20 and min 3")
	private String pword;
	@NotNull
	@Size(min = 3,max = 20,message = "location should be max 20 and min 3")
	private String location;
	@NotNull
	@Size(min = 3,max = 20,message = "customerStreet should be max 20 and min 3")
	private String customerStreet;
	@NotBlank(message = "Area should not be blank")
	private String area;
	@NotBlank(message = "Iteam should not be blank")
	private String item;
	@NotNull
	private Double amount;
	

}
