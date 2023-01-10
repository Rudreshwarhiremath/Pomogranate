package com.xworkz.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.FarmConfiguration;
import com.xworkz.spring.farm.Cow;

public class FarmRunner {

	public static void main(String[] args) {
		ApplicationContext agriculture = new AnnotationConfigApplicationContext(FarmConfiguration.class);
		Cow ref = agriculture.getBean(Cow.class);
		String[] a = agriculture.getBeanDefinitionNames();
		System.out.println(Arrays.toString(a));
		System.err.println(ref);
		String ref1 = agriculture.getBean("pomogranet", String.class);
		System.out.println(ref1);
		String ref2 = agriculture.getBean("papya", String.class);
		System.out.println(ref2);
		String ref3 = agriculture.getBean("Gova", String.class);
		System.out.println(ref3);
		String ref4 = agriculture.getBean("CustredApple", String.class);
		System.out.println(ref4);
		String ref5 = agriculture.getBean("Grapes", String.class);
		System.out.println(ref5);
		Double ref6 = agriculture.getBean("Payment", Double.class);
		System.out.println(ref6);
		Double ref7 = agriculture.getBean("Sallery", Double.class);
		System.out.println(ref7);
		Double ref8 = agriculture.getBean("Cost", Double.class);
		System.out.println(ref8);
		Double ref9 = agriculture.getBean("Investment", Double.class);
		System.out.println(ref9);
		Double ref10 = agriculture.getBean("Expindeture", Double.class);
		System.out.println(ref10);
		Boolean ref11 = agriculture.getBean("Drumstick", Boolean.class);
		System.out.println(ref11);
		Boolean ref12 = agriculture.getBean("Capsicum", Boolean.class);
		System.out.println(ref12);
		Boolean ref13 = agriculture.getBean("Tamato", Boolean.class);
		System.out.println(ref13);
		Boolean ref14 = agriculture.getBean("Cucumber", Boolean.class);
		System.out.println(ref14);
		Boolean ref15 = agriculture.getBean("Chilly", Boolean.class);
		System.out.println(ref15);
		StringBuffer ref16 = agriculture.getBean("name", StringBuffer.class);
		System.out.println(ref16);
		StringBuffer ref17 = agriculture.getBean("value", StringBuffer.class);
		System.out.println(ref17);
		StringBuffer ref18 = agriculture.getBean("cost", StringBuffer.class);
		System.out.println(ref18);
		StringBuffer ref19 = agriculture.getBean("price", StringBuffer.class);
		System.out.println(ref19);
		StringBuffer ref20 = agriculture.getBean("rate", StringBuffer.class);
		System.out.println(ref20);
		StringBuilder ref21 = agriculture.getBean("plough", StringBuilder.class);
		System.out.println(ref21);
		StringBuilder ref22 = agriculture.getBean("katputli", StringBuilder.class);
		System.out.println(ref22);
		StringBuilder ref23 = agriculture.getBean("rotar", StringBuilder.class);
		System.out.println(ref23);
		StringBuilder ref24 = agriculture.getBean("budformer", StringBuilder.class);
		System.out.println(ref24);
		StringBuilder ref25 = agriculture.getBean("seedsower", StringBuilder.class);
		System.out.println(ref25);
		ArrayList ref26 = agriculture.getBean(ArrayList.class);
		ref26.stream().forEach(ele -> System.out.println(ele));
		Map<String, Map> ref27 = agriculture.getBeansOfType(Map.class);
		//System.err.println(ref27.toString());
		Set<Entry<String, Map>> value = ref27.entrySet();
		//value.forEach(ele -> System.out.println(ele));

	}

}
