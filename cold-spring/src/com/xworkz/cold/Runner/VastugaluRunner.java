package com.xworkz.cold.Runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.cold.Configuration.VastugaluConfiguration;
import com.xworkz.cold.Vastugalu.Movie;

public class VastugaluRunner {

	public static void main(String[] args) {
		ApplicationContext holder = new AnnotationConfigApplicationContext(VastugaluConfiguration.class);
		System.err.println(Arrays.toString(holder.getBeanDefinitionNames()));
		
		Movie movie = holder.getBean(Movie.class);
		System.out.println(movie);
		System.out.println(movie.cameraman());
		System.out.println(movie.cameraman().getCamera().getBattery().getCapacity());
		System.out.println(movie.cameraman().getCamera().getLens());
		System.out.println(movie.director().experience());
		System.out.println(movie.director().skill());
		System.out.println(movie.producer().assistant());
		System.out.println(movie.producer().company().location());
		System.out.println(movie.producer().company().area());
		System.out.println(movie.cameraman().getCamera());
		System.out.println(movie.director());
		System.out.println(movie.producer().company());
		System.out.println(movie.producer());
		System.out.println(movie.cameraman().getCamera().getBattery());
		System.err.println(holder.getBeanDefinitionCount());
		

	}

}
