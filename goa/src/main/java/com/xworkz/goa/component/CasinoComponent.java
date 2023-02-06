package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasenoDto;

@Component
@RequestMapping("/got")
public class CasinoComponent {
	public CasinoComponent() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	@PostMapping
	public String toset(CasenoDto dto ,Model model) {
		System.out.println("created casino");
		System.out.println(dto);
		model.addAttribute("name",dto.getName());
		model.addAttribute("cruiseName",dto.getCruiseName());
		model.addAttribute("entryFee",dto.getEntryFee());
		model.addAttribute("FreeFood",dto.isFreeFood());
		model.addAttribute("FreeAlcohol",dto.isFreeAlcohol());
		//model.addAttribute("name", dto.getName());
		return "CasinoSucess.jsp";
	}

}
