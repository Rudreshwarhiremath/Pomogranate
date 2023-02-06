package com.xworkz.rudreshwar.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.rudreshwar")
@Configuration
public class Rudraconfiguration {
	public Rudraconfiguration() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
