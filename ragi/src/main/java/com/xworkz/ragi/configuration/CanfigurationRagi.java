package com.xworkz.ragi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class CanfigurationRagi {
	public CanfigurationRagi() {
		System.out.println("Creted" + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
	{
		System.out.println("Running localContainer in server");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}

}
