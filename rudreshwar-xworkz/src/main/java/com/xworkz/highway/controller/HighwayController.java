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

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class HighwayController {
	@Autowired
	private Highwayservice highwayservice;

	public HighwayController() {
		log.info("Running in controller");
	}

	private List<String> type = Arrays.asList("ExcepressWay","NH", "SH", "DH", "Normal");

	@GetMapping("/highway")
	public String getList(Model model) {
		log.info("Running in gettMapping");
		model.addAttribute("type", type);
		return "HighwayInfo";
	}

	@PostMapping("/highway")
	public String getResult(Model model, HighwayDTO hDto) {
		log.info("Running in postMapping");
		Set<ConstraintViolation<HighwayDTO>> violations = this.highwayservice.validateAndSave(hDto);
		if (violations.isEmpty()) {
			log.info(" no Violation in controller");
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
	public String getFind(Model model, @RequestParam int id) {
		log.info("Running in find");
		HighwayDTO hDto = this.highwayservice.findById(id);
		if (hDto != null) {
			model.addAttribute("dto", hDto);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "HighwaySearch";
	}

	@GetMapping("/delete")
	public String deleteBy(Model model, @RequestParam int id) {
		log.info("Running in delete");
		 this.highwayservice.deletById(id);
		if (id> 0) {
			log.info("dto in controller" + id);
			model.addAttribute("deleted", "Deleted sucessfully");
		} else {
			model.addAttribute("delete", "Delete failed ");
		}
		return "SearchByName";
	}

	@GetMapping("/searchByName")
	public String findByNameOFHighway(Model model, @RequestParam String name) {
		List<HighwayDTO> hdto = this.highwayservice.findByName(name);
		model.addAttribute("lists", hdto);

		return "SearchByName";
	}

	@GetMapping("/update")
	public String update(Model model, @RequestParam int id) {
		log.info("Running in update get method");
		HighwayDTO hdto = this.highwayservice.findById(id);
		model.addAttribute("dto", hdto);
		model.addAttribute("type", type);
		return "UpdatePage";
	}

	@PostMapping("/update")
	public String onUpdate(Model model, HighwayDTO hdto) {
		Set<ConstraintViolation<HighwayDTO>> violations = this.highwayservice.updateAndSave(hdto);
		if (violations.size() > 0) {
			model.addAttribute("errors", violations);
		} else {
			model.addAttribute("message", "Highway updated sucessfully");
		}

		return "UpdatePage";
	}
	@GetMapping("/findLists")
	public String findAll(Model model) {
		List<HighwayDTO> dtoList=this.highwayservice.findAll();
		model.addAttribute("lists",dtoList);
		log.info(""+dtoList.size());
		return "findall";
	}

}
