package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.FarmConfiguration;
import com.xworkz.spring.farm.Cow;

public class FarmRunner {

	public static void main(String[] args) {
		ApplicationContext agriculture=new AnnotationConfigApplicationContext(FarmConfiguration.class);
		Cow ref=agriculture.getBean(Cow.class);
		System.err.println(ref);
		String ref2=agriculture.getBean("pomogranet",String.class);
		System.out.println(ref2);

			
		}

	}


