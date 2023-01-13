package com.xworkz.cold.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.cold.Vastugalu")
public class VastugaluConfiguration {
	public VastugaluConfiguration() {
		System.out.println("created VastugaluConfiguration");
	}

}
