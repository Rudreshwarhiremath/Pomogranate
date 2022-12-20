package com.xworkz.lake.boot;

import com.xworkz.lake.dto.BuildingDto;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.BuildingRepositery;
import com.xworkz.lake.repositery.BuildingRepositeryImpl;
import com.xworkz.lake.service.BuildingService;
import com.xworkz.lake.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		BuildingDto buildingDto = new BuildingDto(185, "Sindholakar house", 5, "yesLift", "YesParking", "Apartment");
		BuildingRepositery buildingRepositery = new BuildingRepositeryImpl();
		BuildingService buildingService = new BuildingServiceImpl(buildingRepositery);
		try {
			buildingService.valideAndSave(buildingDto);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
