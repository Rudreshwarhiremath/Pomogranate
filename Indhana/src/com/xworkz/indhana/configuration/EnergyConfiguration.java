package com.xworkz.indhana.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Indhana")
public class EnergyConfiguration {

	public EnergyConfiguration() {
		System.out.println("Creaed EnergyConfiguration");
	}

}
