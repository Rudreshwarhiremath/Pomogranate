package com.xworkz.lake.service;

import com.xworkz.lake.constant.Seates;
import com.xworkz.lake.dto.TheaterDTO;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.TheaterRepositery;

public class TheaterServiceImpl implements TheaterService {
	private TheaterRepositery theaterRepositery;

	public TheaterServiceImpl(TheaterRepositery theaterRepositery) {
		this.theaterRepositery = theaterRepositery;
	}

	@Override
	public boolean seatBooked(TheaterDTO dto) throws inValideData {
		String id = dto.getId();
		String name = dto.getName();
		String brand = dto.getBrand();
		Seates seates = dto.getSeates();
		boolean valideId = false;
		boolean valideName = false;
		boolean valideBrand = false;
		boolean valideSeates = false;

		if (id != null && id.length() > 3 && id.length() < 20) {
			System.out.println("Valide id-" + id);
			valideId = true;
		} else {
			System.err.println("it is a not valide id" + id);
		}
		if (name != null && name.length() > 3 && name.length() < 20) {
			System.out.println("Valide name-" + name);
			valideName = true;
		} else {
			System.err.println("it is a not valide name" + name);
		}
		if (brand != null && brand.length() > 3 && brand.length() < 20) {
			System.out.println("Valide brand-" + brand);
			valideBrand = true;
		} else {
			System.err.println("it is a not valide brand" + brand);
		}
		if (seates != null) {
			System.out.println("Valide seates" + seates);
			valideSeates = true;
		} else {
			System.err.println("it is a not valide seates" + seates);
		}
		if (valideBrand && valideId && valideName && valideSeates) {
			System.out.println("Valide dto can book data" + dto);
			boolean saved = theaterRepositery.bookMyTicket(dto);
			return saved;
		}
		throw new inValideData("Check the given data");
	}

}
