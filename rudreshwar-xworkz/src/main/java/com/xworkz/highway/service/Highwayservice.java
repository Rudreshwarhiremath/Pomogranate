package com.xworkz.highway.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.highway.dto.HighwayDTO;

public interface Highwayservice {

	Set<ConstraintViolation<HighwayDTO>> validateAndSave(HighwayDTO hdDto);

	Set<ConstraintViolation<HighwayDTO>> updateAndSave(HighwayDTO hdDto);

	default HighwayDTO findById(int id) {
		return null;
	}

	default List<HighwayDTO> findByName(String name) {
		return Collections.emptyList();
	}

	boolean deletById(int id);
}
