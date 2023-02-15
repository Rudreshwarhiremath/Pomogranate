package com.xworkz.ragi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ragi.dto.RagiDTO;
import com.xworkz.ragi.service.RagiService;

@Controller
@RequestMapping("/ragidani")
public class RagiController {
	@Autowired
	private RagiService service;

	public RagiController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String getRagi(RagiDTO dto, Model model) {
		System.out.println(dto);
		boolean saved=this.service.validateAndSave(dto);
		System.out.println(saved);
		System.out.println("Running in Controller dto");
		return "sucess";
	}

}
