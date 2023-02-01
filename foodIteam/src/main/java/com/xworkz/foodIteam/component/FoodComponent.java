package com.xworkz.foodIteam.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/show")
public class FoodComponent {

	public FoodComponent() {
		System.out.println("created  " + this.getClass().getSimpleName());
	} 

	@GetMapping
	public String send(@RequestParam String foodName, @RequestParam String type, @RequestParam int quantity,
			@RequestParam Double price) {
		System.out.println("created send method");
		System.out.println("Foodname " + foodName);
		System.out.println("type " + type);
		System.out.println("quantity " + quantity);
		System.out.println("price " + price);

		return "Fooditeams.jsp";
	}

}
