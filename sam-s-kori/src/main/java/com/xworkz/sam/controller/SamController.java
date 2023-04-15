package com.xworkz.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.sam.dto.SamDto;
import com.xworkz.sam.service.SamService;

@Controller
@RequestMapping("/")
public class SamController {
	@Autowired
	private SamService samService;

	public SamController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@PostMapping("/bts")
	public String onSave(SamDto samDto) {
		this.samService.save(samDto);
		return "index";
	}

}
