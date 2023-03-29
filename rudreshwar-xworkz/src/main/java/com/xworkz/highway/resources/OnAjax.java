package com.xworkz.highway.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.highway.dto.HighwayDTO;
import com.xworkz.highway.service.Highwayservice;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
@EnableWebMvc
public class OnAjax {
	public OnAjax() {
		log.info(this.getClass().getSimpleName());
	}

	@Autowired
	private Highwayservice service;

	@GetMapping(value = "/call", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onCall() {
		log.info("Running in first method of ajax");
		return "Returning in OnCall method";
	}

	@GetMapping(value = "/dto", produces = MediaType.APPLICATION_JSON_VALUE)
	public HighwayDTO forDto() {
		log.info("Running DTO with id");
		// HighwayDTO dto = this.service.findById(id);
		HighwayDTO dto1 = new HighwayDTO();
		dto1.setDestination("Hubbali");
		dto1.setId(21);
		dto1.setKiloMiter(90D);
		dto1.setName("Mallige");
		dto1.setSource("Bangalore");
		dto1.setType("State Highway");
		log.info("--------" + dto1);
		return dto1;
	}

//	@GetMapping(value = "/dto", produces = MediaType.APPLICATION_JSON_VALUE)
//	public String getva() {
//		return "Get values from string";
//	}

}
