package com.xworkz.indhana.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.indhana.configuration.BrowserConfiguration;
import com.xworkz.indhana.intera.Browser;
import com.xworkz.indhana.intera.Provider;
import com.xworkz.indhana.things.Chrome;
import com.xworkz.indhana.things.FireBox;

public class BrowserRunner {

	public static void main(String[] args) {
		ApplicationContext spot = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		System.out.println(Arrays.toString(spot.getBeanDefinitionNames()));
		Browser spring=spot.getBean(Chrome.class);
		spring.browse();
		Browser spring1=spot.getBean(FireBox.class);
		spring1.browse();
		System.err.println(spot.getBeanDefinitionCount());
		
	
	}

}
