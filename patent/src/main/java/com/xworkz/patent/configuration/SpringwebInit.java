package com.xworkz.patent.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringwebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public SpringwebInit() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running in getRootConfigClasses");
		Class[] ref = { BeanConfiguration.class };
		System.out.println("running" + Arrays.toString(ref));

		return ref;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running in getServletConfigClasses");
		Class[] ref = { BeanConfiguration.class };
		System.out.println("running" + Arrays.toString(ref));

		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created in getServletMappings");
		String[] ref1 = { "/" };
		System.out.println("running" + Arrays.toString(ref1));
		return ref1;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running in configureDefaultServletHandling");
		configurer.enable();
	}
}
