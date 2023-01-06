package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.ThingConfiguration;
import com.xworkz.spring.things.Aplication;
import com.xworkz.spring.things.Area;
import com.xworkz.spring.things.Bus;
import com.xworkz.spring.things.Chocolate;
import com.xworkz.spring.things.City;
import com.xworkz.spring.things.Cycle;
import com.xworkz.spring.things.Fish;
import com.xworkz.spring.things.Girl;
import com.xworkz.spring.things.God;
import com.xworkz.spring.things.Mall;
import com.xworkz.spring.things.Mask;
import com.xworkz.spring.things.Milk;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Patient;
import com.xworkz.spring.things.Road;
import com.xworkz.spring.things.Temple;

public class ThingsRunner {

	public static void main(String[] args) {
		ApplicationContext springs1 = new AnnotationConfigApplicationContext(Aplication.class);
		ApplicationContext springs2 = new AnnotationConfigApplicationContext(Area.class);
		ApplicationContext springs3 = new AnnotationConfigApplicationContext(Bus.class);
		ApplicationContext springs4 = new AnnotationConfigApplicationContext(Chocolate.class);
		ApplicationContext springs5 = new AnnotationConfigApplicationContext(City.class);
		ApplicationContext springs6 = new AnnotationConfigApplicationContext(Cycle.class);
		ApplicationContext springs7 = new AnnotationConfigApplicationContext(Fish.class);
		ApplicationContext springs8 = new AnnotationConfigApplicationContext(Girl.class);
		ApplicationContext springs9 = new AnnotationConfigApplicationContext(God.class);
		ApplicationContext springs10 = new AnnotationConfigApplicationContext(Mall.class);
		ApplicationContext springs11 = new AnnotationConfigApplicationContext(Mask.class);
		ApplicationContext springs12 = new AnnotationConfigApplicationContext(Milk.class);
		ApplicationContext springs13 = new AnnotationConfigApplicationContext(Park.class);
		ApplicationContext springs14 = new AnnotationConfigApplicationContext(Patient.class);
		ApplicationContext springs15 = new AnnotationConfigApplicationContext(Road.class);
		ApplicationContext springs16 = new AnnotationConfigApplicationContext(Temple.class);
		Aplication reff1 = springs1.getBean(Aplication.class);
		Area reff2 = springs2.getBean(Area.class);
		Bus reff3 = springs3.getBean(Bus.class);
		Chocolate reff4 = springs4.getBean(Chocolate.class);
		City reff5 = springs5.getBean(City.class);
		Cycle reff6 = springs6.getBean(Cycle.class);
		Fish reff7 = springs7.getBean(Fish.class);
		Girl reff8 = springs8.getBean(Girl.class);
		God reff9 = springs9.getBean(God.class);
		Mall reff10 = springs10.getBean(Mall.class);
		Mask reff11 = springs11.getBean(Mask.class);
		Milk reff12 = springs12.getBean(Milk.class);
		Park reff13 = springs13.getBean(Park.class);
		Patient reff14 = springs14.getBean(Patient.class);
		Road reff15 = springs15.getBean(Road.class);
		Temple reff16 = springs16.getBean(Temple.class);
		System.out.println(System.lineSeparator());
		ApplicationContext springs17 = new AnnotationConfigApplicationContext(ThingConfiguration.class);
		System.err.println(springs17);
	}

}
