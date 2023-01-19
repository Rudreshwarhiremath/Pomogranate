package com.xworkz.crud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crud.configuration.CRUDConfiguration;
import com.xworkz.crud.dto.FirstAidDto;
import com.xworkz.crud.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(CRUDConfiguration.class);
		FirstAidService service = spring.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDto());
		System.out.println(saved);
	}

}
