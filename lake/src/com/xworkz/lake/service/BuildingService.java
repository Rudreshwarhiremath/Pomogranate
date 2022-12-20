package com.xworkz.lake.service;

import com.xworkz.lake.dto.BuildingDto;
import com.xworkz.lake.exception.inValideData;

public interface BuildingService {
	boolean valideAndSave(BuildingDto dto) throws inValideData;

}
