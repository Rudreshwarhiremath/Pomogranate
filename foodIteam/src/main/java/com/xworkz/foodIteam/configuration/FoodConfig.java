package com.xworkz.foodIteam.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.foodIteam")
public class FoodConfig {
	public FoodConfig() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

}
