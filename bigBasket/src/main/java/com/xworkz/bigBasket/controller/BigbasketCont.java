package com.xworkz.bigBasket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bigBasket.dto.BigbasketDTO;
import com.xworkz.bigBasket.repositery.BigBasketRepositery;
import com.xworkz.bigBasket.service.BigService;


@Controller
@RequestMapping
public class BigbasketCont {
	
	@Autowired
	private BigService bigService;
	
	private List<String> area=Arrays.asList("RajajiNagar","VijayNagar","Yeshwantpura","Malleshwaram","BTM","JayNagar","Banashankari");
	private List<String> item=Arrays.asList("Banana","Tomato","Potato","Cucumber","Carrot","Beans","others");

	public BigbasketCont() {
		System.out.println("Created  " + this.getClass().getSimpleName());
	}
	@GetMapping("/display")
	public String getBig( Model model) {
		System.out.println("Running in getMapping");
		model.addAttribute("area", area);
		model.addAttribute("item", item);
		return "bigBasket";
	}
	@PostMapping("/display")
	public String getBig( Model model,BigbasketDTO bdto) {
		System.out.println("Running in postMapping");
	Set<ConstraintViolation<BigbasketDTO>> constraintViolations	=this.bigService.validateAndsave(bdto);
	if(constraintViolations.isEmpty()) {
		model.addAttribute("dto", bdto);
		return "success";
	}
		model.addAttribute("area", area);
		model.addAttribute("item", item);
		model.addAttribute("errors", constraintViolations);
		return "bigBasket";
	}

}
