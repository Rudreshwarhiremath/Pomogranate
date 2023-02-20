package com.xworkz.prema.repositery;

import com.xworkz.prema.entity.PreamEntity;

public interface PreamRepositery {

	boolean save(PreamEntity preamEntity);
	
	default PreamEntity findById(int id) {
		return null; 
	}

}
