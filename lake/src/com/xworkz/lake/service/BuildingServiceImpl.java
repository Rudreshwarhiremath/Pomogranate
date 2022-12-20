package com.xworkz.lake.service;

import com.xworkz.lake.dto.BuildingDto;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.BuildingRepositery;

public class BuildingServiceImpl implements BuildingService {
	private BuildingRepositery buildingRepositery;

	public BuildingServiceImpl(BuildingRepositery buildingRepositery) {
		this.buildingRepositery = buildingRepositery;
	}

	@Override
	public boolean valideAndSave(BuildingDto dto) throws inValideData {
		int no = dto.getNo();
		String name = dto.getName();
		Integer floors = dto.getFloors();
		String lift = dto.getLift();
		String parking = dto.getParking();
		String type = dto.getType();
		boolean valideNo = false;
		boolean valideName = false;
		boolean valideFloors = false;
		boolean valideLift = false;
		boolean valideParking = false;
		boolean valideType = false;
		if (no != 00) {
			System.out.println("No is valide " + no);
			valideNo = true;
		} else {
			System.err.println("No is not valide" + no);
		}
		if (name != null && name.length() > 4 && name.length() < 20) {
			System.out.println("Name is valide " + name);
			valideName = true;
		} else {
			System.err.println("Name is not valide" + name);
		}
		if (floors != null) {
			System.out.println("floors is valide " + floors);
			valideFloors = true;
		} else {
			System.err.println("floors is not valide" + floors);
		}
		if (lift != null && lift.length() > 4 && lift.length() < 20) {
			System.out.println("lift is valide " + lift);
			valideLift = true;
		} else {
			System.err.println("lift is not valide" + lift);
		}
		if (parking != null && parking.length() > 4 && parking.length() < 20) {
			System.out.println("parking is valide " + parking);
			valideParking = true;
		} else {
			System.err.println("parking is not valide" + parking);
		}
		if (type != null && type.length() > 4 && type.length() < 20) {
			System.out.println("type is valide " + type);
			valideType = true;
		} else {
			System.err.println("type is not valide" + type);
		}
		if (valideNo && valideName && valideFloors && valideLift && valideParking && valideType) {
			System.out.println("Valide data and save" + dto);
			boolean saved = buildingRepositery.observed(dto);
			return saved;
		}
		throw new inValideData("Check the data" + dto);
	}

}
