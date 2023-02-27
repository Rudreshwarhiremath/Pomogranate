package com.xworkz.highway.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class HighwayDTO {
	private int id;
	@Size(min = 3, max = 20, message = "name must be lessthan 20 and greatethan 3 ")
	private String name;
	@Size(min = 3, max = 20, message = "source must be lessthan 20 and greatethan 3 ")
	private String source;
	@Size(min = 3, max = 20, message = "destination must be lessthan 20 and greatethan 3 ")
	private String destination;
	@NotNull(message = "Kilometer should not be empty")
	private Double kiloMiter;
	@NotBlank(message = "type should not be blank")
	private String type;

}
