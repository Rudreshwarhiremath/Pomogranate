package com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "festivals")
@NoArgsConstructor
@NamedQuery(name = "findByIdAndName", query = "select ent from FestivalEntity ent where ent.id=:iby and ent.name=:nby")
@NamedQuery(name = "findRegionAndMainGodByNameAndId", query = "select ant.region,ant.mainGod  from FestivalEntity ant where ant.id=:iby and ant.name=:nby")
@NamedQuery(name = "findMainGodAndTotalDaysByName", query = "select ant.mainGod ,ant.totalDays from FestivalEntity ant where  ant.name=:nameby")
@NamedQuery(name = "findByNameAndRegionAndMainGod", query = "select ab from FestivalEntity ab where ab.name=:nby and ab.region=:rby and ab.mainGod=:mby")
@NamedQuery(name = "findByMainGod", query = "select ab from FestivalEntity ab where ab.mainGod=:mby")
@NamedQuery(name = "findTotalDaysByName", query = "select ent.totalDays from FestivalEntity ent where ent.name=:nby")
@NamedQuery(name = "findTotal", query = "select count (en) from FestivalEntity en")
@NamedQuery(name = "findMaxTotalDays", query = "select max (ent.totalDays) from FestivalEntity ent")
public class FestivalEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "region")
	private String region;
	@Column(name = "totalDays")
	private int totalDays;
	@Column(name = "sweet")
	private String sweet;
	@Column(name = "mainGod")
	private String mainGod;

	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}
}
