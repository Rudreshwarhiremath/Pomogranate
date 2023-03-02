package com.xworkz.highway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "highway")
@NamedQuery(name = "findByName",query = "select str from HighwayEntity str where str.name=:nby")
@NamedQuery(name = "deletBy",query = "select ent from HighwayEntity ent where ent.id=:iby")
public class HighwayEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "kiloMiter")
	private Double kiloMiter;
	@Column(name = "type")
	private String type;

}
