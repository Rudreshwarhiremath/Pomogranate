package com.xworkz.prema.controller;

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

import com.xworkz.prema.dto.Preamdto;
import com.xworkz.prema.service.PreamService;

@Controller
@RequestMapping("/valitain")
public class PreamController {
	private List<String> places = Arrays.asList("Cubban Park", "BTM", "Lalbagh", "JpNagar", "IndraNagar");
	private List<String> gifts = Arrays.asList("Chocolate", "Watch", "Sari", "etc.....");
	@Autowired
	private PreamService preamService;

	public PreamController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String getPrema(Model model) {
		System.out.println("Running in getmapping");
		model.addAttribute("place", places);
		model.addAttribute("gifts", gifts);
		return "Valitain";
	}

	@PostMapping
	public String getPrema(Model model, Preamdto vdto) {
		System.out.println("Running in postMapping");
		System.out.println(vdto);
		Set<ConstraintViolation<Preamdto>> violation = this.preamService.validateAndSave(vdto);
		if (violation.isEmpty()) {
			System.out.println(" no Violation in controller go to sucess page ");
			return "ValitainSucess";

		}
		model.addAttribute("place", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("errors", violation);
		model.addAttribute("vdto", vdto);
		System.err.println("violation in controller");
		return "Valitain";
	}
}
