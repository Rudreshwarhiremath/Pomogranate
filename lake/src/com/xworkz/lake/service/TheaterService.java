package com.xworkz.lake.service;

import com.xworkz.lake.dto.TheaterDTO;
import com.xworkz.lake.exception.inValideData;

public interface TheaterService {

	boolean seatBooked(TheaterDTO dto) throws inValideData;
}
