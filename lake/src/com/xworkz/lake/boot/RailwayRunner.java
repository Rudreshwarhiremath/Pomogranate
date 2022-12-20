package com.xworkz.lake.boot;

import com.xworkz.lake.dto.RailwayStationDto;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.RailwayRepositery;
import com.xworkz.lake.repositery.RailwayRepositeryImpl;
import com.xworkz.lake.service.Railwayservice;
import com.xworkz.lake.service.RailwayserviceImpl;

public class RailwayRunner {

	public static void main(String[] args) {
		RailwayStationDto railwayStationDto=new RailwayStationDto("KSR STATion", 12, "Gandhi nagar",20D);
		RailwayRepositery railwayRepositery=new RailwayRepositeryImpl();
		Railwayservice railwayservice=new RailwayserviceImpl(railwayRepositery);
		try {
			railwayservice.save(railwayStationDto);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
