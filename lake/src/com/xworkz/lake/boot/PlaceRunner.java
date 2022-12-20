package com.xworkz.lake.boot;

import com.xworkz.lake.dto.placeDto;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.PlaceRepositery;
import com.xworkz.lake.repositery.PlaceRepositeryImpl;
import com.xworkz.lake.service.PlaceService;
import com.xworkz.lake.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		placeDto placedto = new placeDto("Mysore Palace", "Old famous palace", 120D, 3500D, "Mysore");
		PlaceRepositery placeRepositery = new PlaceRepositeryImpl();
		PlaceService placeService = new PlaceServiceImpl(placeRepositery);
		try {
			placeService.valideAndSave(placedto);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
