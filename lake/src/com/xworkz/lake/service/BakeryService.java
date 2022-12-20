package com.xworkz.lake.service;

import com.xworkz.lake.dto.BakeryDTO;
import com.xworkz.lake.exception.inValideData;

public interface BakeryService {
	boolean savedValideData(BakeryDTO dto) throws inValideData;

}
