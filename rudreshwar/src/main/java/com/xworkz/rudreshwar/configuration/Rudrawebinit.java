package com.xworkz.rudreshwar.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Rudrawebinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class[] ref = { Rudraconfiguration.class };
		return ref;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] ref = { Rudraconfiguration.class };
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		String[] var = { "/" };
		return var;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

}
