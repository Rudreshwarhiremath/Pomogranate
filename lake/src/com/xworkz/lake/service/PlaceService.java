package com.xworkz.lake.service;

import com.xworkz.lake.dto.placeDto;
import com.xworkz.lake.exception.inValideData;

public interface PlaceService {
	boolean valideAndSave(placeDto dto)throws inValideData;

}
