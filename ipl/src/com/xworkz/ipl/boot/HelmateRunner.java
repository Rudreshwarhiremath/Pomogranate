package com.xworkz.ipl.boot;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.HelmateSize;
import com.xworkz.ipl.dto.HelmateDto;
import com.xworkz.ipl.repository.HelmateRepository;
import com.xworkz.ipl.repository.HelmateRepositoryImpl;
import com.xworkz.ipl.service.HelmateService;
import com.xworkz.ipl.service.HelmateServiceImpl;

public class HelmateRunner {

	public static void main(String[] args) {
		HelmateDto helDto = new HelmateDto("Strong", Color.MIXED_COLOR, HelmateSize.SEMI_HALF, 1200D);
		HelmateRepository helmateRepository = new HelmateRepositoryImpl();
		HelmateService helmateService = new HelmateServiceImpl(helmateRepository);
		boolean success = helmateService.validateAndSave(helDto);
		System.out.println("success-" + success);

		System.out.println(System.lineSeparator());
		HelmateDto helDto2 = new HelmateDto(null, null, null, null);
		boolean success1 = helmateService.validateAndSave(helDto2);
		System.out.println("success1-" + success1);

	}

}
