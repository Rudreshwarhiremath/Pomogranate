package com.xworkz.crud.boot;

import com.xworkz.crud.dto.TerroristDTO;
import com.xworkz.crud.service.TerrerServiceImpli;
import com.xworkz.crud.service.TerroristeService;

public class TerroristRunner {
	public static void main(String[] args) {
		TerroristDTO dto=new TerroristDTO();
		dto.setName("Fazalm");
		dto.setAge(24);
		dto.setCountry("Pakistan");
		dto.setOrganisation("Paking double");
		dto.setAlive(true);
		dto.setPrison(false);
		System.out.println(dto);
		TerroristeService service=new TerrerServiceImpli();
		service.validateAndSaved(dto);
	}

}
