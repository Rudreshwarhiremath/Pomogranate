package com.xworkz.foodIteam.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.foodIteam.InterviewDto;

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

	@PostMapping
	public String see(InterviewDto dto) {
		System.out.println("Running in InterviewDto");
		System.out.println(dto);
		return "Interview.jsp";
	}

}
