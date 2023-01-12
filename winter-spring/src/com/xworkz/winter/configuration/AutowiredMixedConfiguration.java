package com.xworkz.winter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.winter.thing.vastugalu")
public class AutowiredMixedConfiguration {
	public AutowiredMixedConfiguration() {
		System.out.println("created default conifiguration");
	}

	@Bean
	public String id() {
		return "VRL media";
	}

	@Bean
	public String name() {
		return "Vijayavani";
	}

	@Bean
	public String ownerName() {
		return "Anand sankeshwar";
	}

	@Bean
	public String langauge() {
		return "Kannada";
	}

	@Bean
	public Double price() {
		return 4.5;
	}

	@Bean
	public String nameOfSnake() {
		return "Black Cobra";
	}

	@Bean
	public Double length() {
		return 6.27;
	}

	@Bean
	public String color() {
		return "Black";
	}

	@Bean
	public String type() {
		return "Nagar havu";
	}

	@Bean
	public boolean poisionous() {
		return true;
	}

	@Bean
	public String nameOfEngine() {
		return "kryotec";
	}

	@Bean
	public String typeOfEngine() {
		return "Disele";
	}

	@Bean
	public String number() {
		return "RGH8088928928HMT";
	}

	@Bean
	public String version() {
		return "BS6";
	}

	@Bean
	public String company() {
		return "TATA";
	}

	@Bean
	public int strokes() {
		return 4;
	}

	@Bean
	public String nameOfGhost() {
		return "pathima";
	}

	@Bean
	public String location() {
		return "HaishandrGhata";
	}

	@Bean
	public double age() {
		return 24D;
	}

	@Bean
	public double nailLength() {
		return 4.56;
	}

	@Bean
	public String gender() {
		return "female";
	}

	@Bean
	public String favoritePerson() {
		return "Fazalm";
	}

	@Bean
	public String favoriteFood() {
		return "Chicken";
	}

	@Bean
	public String favoriteColor() {
		return "brown";
	}

	@Bean
	public Long favoritePersonMobile() {
		return 8050153518L;
	}

	@Bean
	public int favoritePersonAge() {
		return 26;
	}

	@Bean
	public String likingPersonVillage() {
		return "Bhalki";
	}

	@Bean
	public String village() {
		return "bhalki";
	}

	@Bean
	public String favoriteSong() {
		return "Enchara ve ";
	}

	@Bean
	public String favoriteSongComposer() {
		return "Rajesh ramanath";
	}

	@Bean
	public String favoriteHero() {
		return "Sharu khan";
	}

	@Bean
	public String favoriteHeroine() {
		return "Gauri Khan";
	}

	@Bean
	public String favoriteFilm() {
		return "ghost devva";
	}

	@Bean
	public String favoriteFestival() {
		return "punya thithi";
	}

	@Bean
	public boolean haveHusubend() {
		return true;
	}

	@Bean
	public boolean flaying() {
		return true;
	}

}
