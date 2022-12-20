package com.xworkz.lake.repositery;

import com.xworkz.lake.dto.BuildingDto;
import com.xworkz.lake.exception.sizeExcedException;

public class BuildingRepositeryImpl implements BuildingRepositery {
	private BuildingDto [] buildingDto=new BuildingDto[5];
	private int dtoIndex=0;

	@Override
	public boolean observed(BuildingDto dto) {
		if(dtoIndex>buildingDto.length) {
			System.err.println("Size exceded canot add more...");
			throw new sizeExcedException("Size check"+buildingDto.length);
		}
		this.buildingDto[dtoIndex]=dto;
		this.dtoIndex++;
		return false;
	}

}
