package com.xworkz.lake.repositery;

import com.xworkz.lake.dto.RailwayStationDto;
import com.xworkz.lake.exception.sizeExcedException;

public class RailwayRepositeryImpl implements RailwayRepositery {
	private RailwayStationDto [] railwayStationDto = new RailwayStationDto[5];
	private int currentIndex=0;
	@Override
	public boolean checked(RailwayStationDto dto) {
		if(currentIndex>railwayStationDto.length) {
			System.out.println("No more adds...");
			throw new sizeExcedException("Check the in put sets "+railwayStationDto);
		}
      this.railwayStationDto[currentIndex]=dto;
      this.currentIndex++;
		return false;
	}

}
