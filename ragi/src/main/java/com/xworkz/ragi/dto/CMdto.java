package com.xworkz.ragi.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CMdto {
	@NotNull
	@Size(min = 3,max = 20,message = "CM name is must be greater ten 3 and less then 20")
	private String name;
	@NotBlank(message = "Party should not be blank")
	private String party;
	@NotBlank (message = "State should not be blank")
	private String state;
	@NotNull (message = "Tenure should not be null")
	@Min(value = 1,message = "tenure cannot be less than zero")
	private Integer tenure;
	@NotNull
	@Size(min = 3,max = 20,message = "Portfilio name is must be greater ten 5 and less then 20")
	private String portfilio;
	

}
