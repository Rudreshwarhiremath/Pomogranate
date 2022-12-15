package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;
import com.xworkz.ipl.repository.PizzaRepositery;
import com.xworkz.ipl.repository.PizzaRepositeryImpli;
import com.xworkz.ipl.service.Pizzaservice;
import com.xworkz.ipl.service.PizzaserviceImpli;

public class PizzaRunner {

	public static void main(String[] args) {

		PizzaRepositery pizzaRepositery = new PizzaRepositeryImpli();
		PizzaDTO pizzadto = new PizzaDTO();
		pizzadto.setName("Tomato pizza");
		pizzadto.setCompnay("Dominos");
		pizzadto.setCheese(true);
		pizzadto.setFlavour("Tomato");
		pizzadto.setPrice(120);
		pizzadto.setSize(PizzaSize.MEDIUM);
		pizzadto.setType("VEG");
		pizzadto.setCreatedBy("SYSTEM");
		pizzadto.setCreatedDate(LocalDateTime.now());

		pizzaRepositery.create(pizzadto);

		Pizzaservice pizzaservice = new PizzaserviceImpli();
		boolean saved = pizzaservice.validateAndSave(pizzadto);
		System.out.println(saved);
		System.out.println("+++++");
		//System.out.println(pizzaRepositery.create(pizzadto));
		System.out.println(pizzaRepositery.total());

	}

}
