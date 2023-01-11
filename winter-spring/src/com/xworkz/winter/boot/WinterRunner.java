package com.xworkz.winter.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.winter.configuration.WinterThingconfiga;
import com.xworkz.winter.thing.Actor;
import com.xworkz.winter.thing.Rocket;
import com.xworkz.winter.thing.Season;

public class WinterRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(WinterThingconfiga.class);
		String[] define = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(define));

		Rocket rock = spring.getBean("rocket", Rocket.class);// component
		String country = rock.getCountry();
		System.out.println(rock);
		System.out.println(country);
		System.out.println(rock.getName());
		System.out.println(rock.getBudget());
		Rocket rockget = spring.getBean("getRocket", Rocket.class);// bean
		String countryget = rockget.getCountry();
		System.out.println(rockget);
		System.out.println(countryget);
		System.out.println(rockget.getName());
		System.out.println(rockget.getBudget());
		Actor acting = spring.getBean("actor", Actor.class);// component
		System.out.println(acting);
		System.out.println(acting.getName());
		System.out.println(acting.getLangauge());
		System.out.println(acting.getAge());
		Actor act = spring.getBean("getActor", Actor.class);// bean
		System.out.println(act);
		System.out.println(act.getName());
		System.out.println(act.getLangauge());
		System.out.println(act.getAge());
		Season bisul = spring.getBean("season", Season.class);
		System.out.println(bisul);
		System.out.println(bisul.getName());
		System.out.println(bisul.getDuration());
		System.out.println(bisul.getStartingMonth());
		Season male = spring.getBean("getSeason", Season.class);
		System.out.println(male);
		System.out.println(male.getName());
		System.out.println(male.getDuration());
		System.out.println(male.getStartingMonth());

	}

}
