package com.xworkz.prema.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Preamdto {
	private int id;
	@Size(min = 3,max = 20,message = "Name must be greaterthan 3 character and less then 20 character")
	private String name;
	@Size(min = 3,max = 20,message = "valentineName must be greaterthan 3 character and less then 20 character")
	private String valentineName;
	@NotBlank(message = "Place should not be blank")
	private String place;
	@NotBlank(message = "Gift should not be blank")
	private String gift;
}
