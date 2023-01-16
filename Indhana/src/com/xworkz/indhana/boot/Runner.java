package com.xworkz.indhana.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.indhana.configuration.EnergyConfiguration;
import com.xworkz.indhana.intera.PetroleBunk;

public class Runner {
	public static void main(String[] args) {

		ApplicationContext store = new AnnotationConfigApplicationContext(EnergyConfiguration.class);
		System.out.println(Arrays.toString(store.getBeanDefinitionNames()));
		PetroleBunk bunk = store.getBean(PetroleBunk.class);
		bunk.purchase();
		

	}

}
