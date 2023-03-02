package com.xworkz.swimming.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name="car")
public class Cardto {
	@Column(name="id")
	@Id
	private Integer id;
	@Column(name="car_name")
	private String name;
	@Column(name="car_brand")
	private String brand;
	@Column(name="car_rate")
	private String rate;

}
