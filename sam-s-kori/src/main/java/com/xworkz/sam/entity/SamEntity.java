package com.xworkz.sam.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "sams")
@Data
public class SamEntity {
	private int id;
	private String name;
	private String email;
	private String password;
	private long mobile;

}
