package com.xworkz.patent.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.patent")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
