package com.xworkz.spring.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring.farm")
public class FarmConfiguration {
	public FarmConfiguration() {
		System.out.println("created farm configuration");
	}
	@Bean
	public String pomogranet() {
		System.out.println("created string bean as pomogranet--1");
		String string=new String("Kesar ");
		return string;
		
	}
	@Bean
	public String papya() {
		System.out.println("created string as papya---2");
		String string=new String("Taivan 786");
		return string;
	}
	@Bean
	public String Gova() {
		System.out.println("created string as Gova---3");
		String string=new String("Lacknow gold");
		return string;
	}
	@Bean
	public String CustredApple() {
		System.out.println("created string as Gova---4");
		String string=new String("Golden");
		return string;
	}
	@Bean
	public String Grapes() {
		System.out.println("created string as Grapes---5");
		String string=new String("Thamson seedless");
		return string;
	}
	@Bean
	public Boolean Drumstick() {
		System.out.println("created drumstick as boolean--1");
		Boolean bool=new Boolean(true);
		return bool;
	}
	@Bean
	public Boolean Capsicum() {
		System.out.println("created capsicum as boolean--2");
		Boolean booleaN=new Boolean(true);
		return booleaN;
	}
	@Bean
	public Boolean Tamato() {
		System.out.println("created tamato as boolean---3");
		Boolean booleaN=new Boolean(true);
		return booleaN; 
	}
	@Bean
	public Boolean Cucumber() {
		System.out.println("created Cucumber as boolean---4");
		Boolean booleaN=new Boolean(true);
		return booleaN; 
	}
	@Bean
	public Boolean Chilly() {
		System.out.println("created Chilly as boolean---5");
		Boolean booleaN=new Boolean(true);
		return booleaN; 
	}
	@Bean
	public Double Payment() {
		System.out.println("created payment as double---1");
		Double doub=new Double(10000D);
		return doub;
	}
	@Bean
	public Double Sallery() {
		System.out.println("created Sallery as double---2");
		Double doub=new Double(150000D);
		return doub;
	}
	@Bean
	public Double Cost() {
		System.out.println("created Cost as double---3");
		Double doub=new Double(400000D);
		return doub;
	}
	@Bean
	public Double Investment() {
		System.out.println("created Investment as double---4");
		Double doub=new Double(1000000D);
		return doub;
	}
	@Bean
	public Double Expindeture() {
		System.out.println("created Expindeture as double---5");
		Double doub=new Double(500000D);
		return doub;
	}
	@Bean
	public StringBuffer  name() {
		System.out.println("created string buffer as name");
		StringBuffer buffer=new StringBuffer("name");
		return buffer;
	}
	@Bean
	public StringBuffer value() {
		System.out.println("created string buffer as value");
		StringBuffer buffer=new StringBuffer("value");
		return buffer;
	}
	@Bean
	public StringBuffer cost() {
		System.out.println("created string buffer as cost");
		StringBuffer buffer=new StringBuffer("cost");
		return buffer;
	}
	@Bean
	public StringBuffer price() {
		System.out.println("created string buffer as price");
		StringBuffer buffer=new StringBuffer("price");
		return buffer;
	}
	@Bean
	public StringBuffer rate() {
		System.out.println("created string buffer as rate");
		StringBuffer buffer=new StringBuffer("rate");
		return buffer;
	}
	@Bean
	public StringBuilder plough() {
		System.out.println("created string builder as plough");
		StringBuilder builder=new StringBuilder("plough");
		return builder;
	}
	@Bean("katputli")
	public StringBuilder cultivater() {
		System.out.println("created string builder as cultivater");
		StringBuilder builder=new StringBuilder("cultivater");
		return builder;
	}
	@Bean
	public StringBuilder rotar() {
		System.out.println("created string builder as rotar");
		StringBuilder builder=new StringBuilder("rotar");
		return builder;
	}
	@Bean
	public StringBuilder budformer() {
		System.out.println("created string builder as budformer");
		StringBuilder builder=new StringBuilder("budformer");
		return builder;
	}
	@Bean
	public StringBuilder seedsower() {
		System.out.println("created string builder as seedsower");
		StringBuilder builder=new StringBuilder("seedsower");
		return builder;
	}
	@Bean ("lays")
	public ArrayList layebrs() {
		System.out.println("created array list ");
		ArrayList list=new ArrayList();
		list.add("Siddu");
		list.add("vijaykumar");
		list.add("Sanjappa");
		list.add("Jagappa");
		list.add("Hanumanth");
		System.out.println(list.size());
		return list;
	}
	@Bean("crops")
	public Map<String, String> crops() {
		System.out.println("created map ");
		Map<String, String> croptypes=new HashMap<String,String>();
		croptypes.put("Fruits", "Pomogranate");
		croptypes.put("Vegitables", "Cucumber");
		croptypes.put("Comersial", "Ginger");
		croptypes.put("Seasionable", "Mango");
		croptypes.put("Aurvedic", "Alovera");
		return croptypes;
	}
	
	

}
