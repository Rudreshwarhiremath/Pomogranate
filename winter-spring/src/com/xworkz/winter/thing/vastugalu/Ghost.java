package com.xworkz.winter.thing.vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	private String name;
	private String location;
	private double age;
	private double nailLength;
	private String gender;
	private String favoritePerson;
	private String favoriteFood;
	private String favoriteColor;
	private Long favoritePersonMobile;
	private int favoritePersonAge;
	@Autowired
	private String likingPersonVillage;
	@Autowired
	private String village;
	@Autowired
	private String favoriteSong;
	@Autowired
	private String favoriteSongComposer;
	@Autowired
	private String favoriteHero;
	@Autowired
	private String favoriteHeroine;
	@Autowired
	private String favoriteFilm;
	@Autowired
	private String favoriteFestival;
	@Autowired
	private boolean haveHusubend;
	@Autowired
	private boolean flaying;

	public Ghost(@Qualifier("nameOfGhost") String name, String location, double age, double nailLength, String gender, String favoritePerson,
			String favoriteFood, String favoriteColor, Long favoritePersonMobile, int favoritePersonAge) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
		this.nailLength = nailLength;
		this.gender = gender;
		this.favoritePerson = favoritePerson;
		this.favoriteFood = favoriteFood;
		this.favoriteColor = favoriteColor;
		this.favoritePersonMobile = favoritePersonMobile;
		this.favoritePersonAge = favoritePersonAge;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", location=" + location + ", age=" + age + ", nailLength=" + nailLength
				+ ", gender=" + gender + ", favoritePerson=" + favoritePerson + ", favoriteFood=" + favoriteFood
				+ ", favoriteColor=" + favoriteColor + ", favoritePersonMobile=" + favoritePersonMobile
				+ ", favoritePersonAge=" + favoritePersonAge + ", likingPersonVillage=" + likingPersonVillage
				+ ", village=" + village + ", favoriteSong=" + favoriteSong + ", favoriteSongComposer="
				+ favoriteSongComposer + ", favoriteHero=" + favoriteHero + ", favoriteHeroine=" + favoriteHeroine
				+ ", favoriteFilm=" + favoriteFilm + ", favoriteFestival=" + favoriteFestival + ", haveHusubend="
				+ haveHusubend + ", flaying=" + flaying + "]";
	}

}
