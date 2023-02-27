package com.xworkz.highway.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.highway.dto.HighwayDTO;
import com.xworkz.highway.service.Highwayservice;

@Controller
@RequestMapping("/")
public class HighwayController {
	@Autowired
	private Highwayservice highwayservice;

	public HighwayController() {
		System.out.println("Running in controller");
	}

	private List<String> type = Arrays.asList("NH", "SH", "DH", "Normal");

	@GetMapping("/highway")
	public String getList(Model model) {
		System.out.println("Running in gettMapping");
		model.addAttribute("type", type);
		return "HighwayInfo";
	}

	@PostMapping("/highway")
	public String getResult(Model model, HighwayDTO hDto) {
		System.out.println("Running in postMapping");
		Set<ConstraintViolation<HighwayDTO>> violations = this.highwayservice.validateAndSave(hDto);
		if (violations.isEmpty()) {
			System.out.println(" no Violation in controller");
			model.addAttribute("message", "Data Saved Sucessfully");
			model.addAttribute("type", type);
			model.addAttribute("message", "Data saved sucessfully");
			return "HighwayInfo";

		}
		model.addAttribute("errors", violations);
		model.addAttribute("type", type);
		model.addAttribute("messages", "Data not saved");
		return "HighwayInfo";
	}
	@GetMapping("/find")
	public String getFind(Model model,@RequestParam int id) {
		System.out.println("Running in find");
		HighwayDTO hDto=this.highwayservice.findById(id);
		if (hDto != null) {
			model.addAttribute("dto", hDto);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "HighwaySearch";
	}

}
