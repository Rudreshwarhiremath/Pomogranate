package com.xworkz.highway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.highway")
@Slf4j
public class HighwayConfig {

	public HighwayConfig() {
		log.info("created " + this.getClass().getSimpleName());
	}

	@Bean
	public MultipartResolver multipartResolver() {
		log.info("Running in multipartResolver");
		return new StandardServletMultipartResolver();
	}

	@Bean
	@Order(1)
	public ViewResolver viewResolver() {
		log.info("Running in viewresolwer");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		return new LocalContainerEntityManagerFactoryBean();
	}

}
