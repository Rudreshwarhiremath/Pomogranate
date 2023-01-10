package com.xworkz.winter.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.winter.thing.Actor;
import com.xworkz.winter.thing.Rocket;
import com.xworkz.winter.thing.Season;

@Configuration
@ComponentScan("com.xworkz.winter")
public class WinterThingconfiga {
	public WinterThingconfiga() {
	
	}
	@Bean
	public Rocket getRocket() {
		Rocket rock=new Rocket();
		rock.getCountry();
		return rock;
	}
	@Bean
	public Actor getActor() {
		Actor act=new Actor("VijayDevarkunda", "Telagu", 30);
		return act;
	}
	@Bean
	public Season getSeason() {
		Season challi=new Season();
		challi.setName("Summer");
		challi.setDuration(3D);
		challi.setStartingMonth("March");
		return challi;
	}
	

}
