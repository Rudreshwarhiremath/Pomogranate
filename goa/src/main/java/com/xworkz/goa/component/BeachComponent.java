package com.xworkz.goa.component;



import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDto;

@Component
@RequestMapping("/show")
public class BeachComponent {
	public BeachComponent() {
		System.out.println("created" + this.getClass().getSimpleName());

	}

	@PostMapping
	public String getBeach(BeachDto dto, Model model) {
		System.out.println("created beachComponent");
		System.out.println(dto);
		model.addAttribute("name",dto.getName());
		model.addAttribute("game",dto.getGames());
		model.addAttribute("location",dto.getLocation());
		model.addAttribute("clean",dto.isClean());
		return "BeachSucess.jsp";
	}
}
