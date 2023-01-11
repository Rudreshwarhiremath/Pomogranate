package com.xworkz.winter.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.winter.autowirebasic.HardwareShop;
import com.xworkz.winter.autowirebasic.Pencil;
import com.xworkz.winter.autowirebasic.Rubber;
import com.xworkz.winter.autowirebasic.Software;
import com.xworkz.winter.autowirebasic.SowftwareEngineer;
import com.xworkz.winter.autowirebasic.Tractor;
import com.xworkz.winter.configuration.AutowirebasicConfiguration;

public class AutowirebasicRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AutowirebasicConfiguration.class);
		String[] total = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(total));
		HardwareShop shop = container.getBean(HardwareShop.class);
		System.out.println(shop);
		Software soft = container.getBean(Software.class);
		System.out.println(soft);
		SowftwareEngineer man = container.getBean(SowftwareEngineer.class);
		System.out.println(man);
		Pencil pen = container.getBean(Pencil.class);
		System.out.println(pen);
		Rubber rubb = container.getBean(Rubber.class);
		System.out.println(rubb);
		Tractor machinery = container.getBean(Tractor.class);
		System.out.println(machinery);

	}

}
