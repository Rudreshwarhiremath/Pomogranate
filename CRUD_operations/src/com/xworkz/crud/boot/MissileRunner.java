package com.xworkz.crud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crud.configuration.CRUDConfiguration;
import com.xworkz.crud.dto.MissileDto;
import com.xworkz.crud.service.MissileService;

public class MissileRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(CRUDConfiguration.class);
		MissileService service = container.getBean(MissileService.class);
		service.validateAndSave(new MissileDto());
	}

}
