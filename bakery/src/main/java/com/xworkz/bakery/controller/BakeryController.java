package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {
	@Autowired
	private BakeryService service;
	public BakeryController() {
		System.out.println("Created controller " + this.getClass().getSimpleName());
	}

	@GetMapping("/bakeryinfo")
	public String getBakery(BakeryDTO dto, Model model) {
		System.out.println("Running in BakeryDTO MAPPER");
		System.out.println(dto);
		boolean saved=this.service.validateAndSave(dto);
		System.out.println("Backery dto saved:"+saved);
		model.addAttribute("bdto", dto);
		return "index";
	}

}
