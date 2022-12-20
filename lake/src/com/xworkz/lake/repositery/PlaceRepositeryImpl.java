package com.xworkz.lake.repositery;

import com.xworkz.lake.dto.placeDto;
import com.xworkz.lake.exception.sizeExcedException;

public class PlaceRepositeryImpl implements PlaceRepositery {
	private placeDto [] placeDto=new placeDto[5];
	private int storeIndex=0;

	@Override
	public boolean save(placeDto dto) {
		if(storeIndex>placeDto.length) {
			System.out.println("Size is exceded can not add more..");
			throw new sizeExcedException("-"+placeDto.length);
		}
		this.placeDto[storeIndex]=dto;
		this.storeIndex++;
		return false;
	}

}
