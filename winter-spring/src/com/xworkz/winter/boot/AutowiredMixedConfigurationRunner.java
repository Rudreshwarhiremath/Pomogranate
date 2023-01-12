package com.xworkz.winter.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.winter.configuration.AutowiredMixedConfiguration;
import com.xworkz.winter.thing.vastugalu.Engine;
import com.xworkz.winter.thing.vastugalu.Ghost;
import com.xworkz.winter.thing.vastugalu.Newspaper;
import com.xworkz.winter.thing.vastugalu.Snake;

public class AutowiredMixedConfigurationRunner {

	public static void main(String[] args) {
		ApplicationContext storage=new AnnotationConfigApplicationContext(AutowiredMixedConfiguration.class);
		//String a[]= storage.getBeanDefinitionNames();
		System.out.println(Arrays.toString(storage.getBeanDefinitionNames()));
		System.out.println(storage.getBeanDefinitionCount());
		
		Newspaper paper=storage.getBean(Newspaper.class);
		System.out.println(paper);
		
		Snake havu=storage.getBean(Snake.class);
		System.out.println(havu);
		
		Engine machine=storage.getBean(Engine.class);
		System.out.println(machine);
		
		Ghost devvu=storage.getBean(Ghost.class);
		System.out.println(devvu);

	}

}
