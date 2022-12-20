package com.xworkz.lake.service;

import com.xworkz.lake.dto.RailwayStationDto;
import com.xworkz.lake.exception.inValideData;

public interface Railwayservice {
	boolean save(RailwayStationDto dto) throws inValideData;

}
