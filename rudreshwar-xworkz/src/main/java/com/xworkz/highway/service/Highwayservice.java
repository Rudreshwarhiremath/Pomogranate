package com.xworkz.highway.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.highway.dto.HighwayDTO;

public interface Highwayservice {
	Set<ConstraintViolation<HighwayDTO>> validateAndSave(HighwayDTO hdDto);

	default HighwayDTO findById(int id) {
		return null;
	}
}
