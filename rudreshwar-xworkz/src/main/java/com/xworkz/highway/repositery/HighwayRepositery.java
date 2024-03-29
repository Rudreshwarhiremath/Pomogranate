package com.xworkz.highway.repositery;

import java.util.Collections;
import java.util.List;

import com.xworkz.highway.entity.HighwayEntity;

public interface HighwayRepositery {

	boolean save(HighwayEntity highwayEntity);

	boolean update(HighwayEntity highwayEntity);

	default HighwayEntity findById(int id) {
		return null;
	}

	default List<HighwayEntity> findByName(String name) {
		return Collections.emptyList();
	}

	boolean  deletById(int id);
	default List<HighwayEntity> findAll() {
		return Collections.emptyList();
	}
	
}
