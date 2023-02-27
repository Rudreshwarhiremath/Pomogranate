package com.xworkz.highway.repositery;

import com.xworkz.highway.entity.HighwayEntity;

public interface HighwayRepositery {

	boolean save(HighwayEntity highwayEntity);

	default HighwayEntity findById(int id) {
		return null;
	}

}
