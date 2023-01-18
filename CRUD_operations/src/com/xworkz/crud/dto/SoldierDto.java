package com.xworkz.crud.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SoldierDto extends AbstractAuditdto {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 25, message = "name length must be greter then 3 and less then 25")
	private String name;
	@Min(value = 15, message = "minimum must be greter then 15")
	@Max(value = 55, message = "maximum must be less then 55")
	private int age;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 25, message = "rank length must be greter then 3 and less then 25")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 25, message = "position length must be greter then 3 and less then 25")
	private String position;

}
