package com.xworkz.ragi.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ragi.dto.CMdto;
import com.xworkz.ragi.service.CMService;

@Controller
@RequestMapping("/cmyogi")
public class CMController {
	@Autowired
	private CMService service;

	public CMController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String getPostmethod(CMdto cmdto,Model model) {
		System.out.println(cmdto);
		System.out.println("Running in getPostmethod");
		Set<ConstraintViolation<CMdto>> constraintViolations = this.service.validateAndsave(cmdto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("Validation failed Display error message");
			constraintViolations.forEach((cv) -> System.err.println(cv.getMessage()));
		} else {
			{
				System.out.println("Validation sucess,display sucess message");
			}
		}

		return "cm";
	}

}
