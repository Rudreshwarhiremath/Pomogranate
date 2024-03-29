package com.xworkz.highway.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class HighwayWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running in  getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running in  getServletConfigClasses");
		return new Class[] { HighwayConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running in  getServletMappings");
		return new String[] { "/" };
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		String tempDir = "D:\\temp";
		int maxUploadSizeInMb = 3 * 1024 * 1024;
		File uploadDirectory = new File(tempDir);
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);
		registration.setMultipartConfig(multipartConfigElement);

	}

}
