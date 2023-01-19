package com.xworkz.crud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crud.configuration.CRUDConfiguration;
import com.xworkz.crud.dto.ResortDto;
import com.xworkz.crud.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(CRUDConfiguration.class);
		ResortService service = spring.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDto());
		System.out.println(saved);
	}

}
