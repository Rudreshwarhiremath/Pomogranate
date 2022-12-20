package com.xworkz.lake.service;

import com.xworkz.lake.dto.placeDto;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.PlaceRepositery;

public class PlaceServiceImpl implements PlaceService {
	private PlaceRepositery placeRepositery;

	public PlaceServiceImpl(PlaceRepositery placeRepositery) {
		this.placeRepositery = placeRepositery;
	}

	@Override
	public boolean valideAndSave(placeDto dto) throws inValideData {
		String name = dto.getName();
		String famousFor = dto.getFamousFor();
		Double distance = dto.getDistance();
		Double expenditure = dto.getExpenditure();
		String city = dto.getCity();
		boolean valideName = false;
		boolean valideFamousFor = false;
		boolean valideDistance = false;
		boolean valideExpenditure = false;
		boolean valideCity = false;
		if (name != null && name.length() > 4 && name.length() < 20) {
			System.out.println("Name is valide " + name);
			valideName = true;
		} else {
			System.err.println("Name is not valide" + name);
		}
		if (famousFor != null) {
			System.out.println("famousFor is valide " + famousFor);
			valideFamousFor = true;
		} else {
			System.err.println("floors is not valide" + famousFor);
		}
		if (distance != null) {
			System.out.println("distance is valide " + distance);
			valideDistance = true;
		} else {
			System.err.println("distance is not valide" + distance);
		}
		if (expenditure != null) {
			System.out.println("expenditure is valide " + expenditure);
			valideExpenditure = true;
		} else {
			System.err.println("expenditure is not valide" + expenditure);
		}
		if (city != null && city.length() > 4 && city.length() < 20) {
			System.out.println("city is valide " + city);
			valideCity = true;
		} else {
			System.err.println("city is not valide" + city);
		}
		if (valideName && valideFamousFor && valideDistance && valideExpenditure && valideCity) {
			System.out.println("Valide dto save"+dto);
			boolean saved = placeRepositery.save(dto);
			return saved;
		}

		throw new inValideData("Invalide data plz check the data");
	}

}
