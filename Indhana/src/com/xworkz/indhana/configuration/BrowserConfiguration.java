package com.xworkz.indhana.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.indhana.things")
public class BrowserConfiguration {
	public BrowserConfiguration() {
		System.out.println("Created BrowserConfiguration");
	}

}
