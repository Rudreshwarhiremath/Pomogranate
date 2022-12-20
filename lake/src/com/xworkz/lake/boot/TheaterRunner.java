package com.xworkz.lake.boot;

import com.xworkz.lake.constant.Seates;
import com.xworkz.lake.dto.TheaterDTO;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.TheaterRepositery;
import com.xworkz.lake.repositery.TheaterRepositeryImpl;
import com.xworkz.lake.service.TheaterService;
import com.xworkz.lake.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		TheaterDTO theaterDTO = new TheaterDTO("PVR Cinema", "P V R ", "Gt World", Seates.PLATINUM);
		TheaterRepositery theaterRepositery = new TheaterRepositeryImpl();
		TheaterService theaterService = new TheaterServiceImpl(theaterRepositery);
		theaterRepositery.bookMyTicket(theaterDTO);
		try {
			theaterService.seatBooked(theaterDTO);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
