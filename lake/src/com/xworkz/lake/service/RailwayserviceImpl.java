package com.xworkz.lake.service;

import com.xworkz.lake.dto.RailwayStationDto;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.RailwayRepositery;

public class RailwayserviceImpl implements Railwayservice {
	private RailwayRepositery railwayRepositery;

	public RailwayserviceImpl(RailwayRepositery railwayRepositery) {
		this.railwayRepositery = railwayRepositery;
	}

	@Override
	public boolean save(RailwayStationDto dto) throws inValideData {
		String name = dto.getName();
		int noOFplatforms = dto.getNoOFplatforms();
		String area = dto.getArea();
		Double platformTicketprice = dto.getPlatformTicketprice();
		boolean valideName = false;
		boolean valideArea = false;
		boolean validePlatForm = false;
		boolean validenoOfPaltform = false;
		if (name != null && name.length() > 3 && name.length() < 20) {
			System.out.println("Name is valide" + name);
			valideName = true;
		} else {
			System.err.println("Name is not valide" + name);
		}
		if (noOFplatforms != 00) {
			System.out.println("noOFplatforms is valide" + noOFplatforms);
			validenoOfPaltform = true;
		} else {
			System.err.println("noOFplatforms is not valide" + noOFplatforms);
		}
		if (area != null && area.length() > 3 && area.length() < 20) {
			System.out.println("area is valide" + area);
			valideArea = true;
		} else {
			System.err.println("area is not valide" + area);
		}
		if (platformTicketprice != null) {
			System.out.println("Name is valide" + platformTicketprice);
			validePlatForm = true;
		} else {
			System.err.println("platformTicketprice is not valide" + platformTicketprice);
		}
		if (valideName && valideArea && validePlatForm && validenoOfPaltform) {
			System.out.println("All data is valide"+dto);
			boolean saved = railwayRepositery.checked(dto);
			return saved;
		}
		throw new inValideData("Check weather given data");

	}

}
