package com.xworkz.prema.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.prema.dto.Preamdto;

public interface PreamService {

	Set<ConstraintViolation<Preamdto>> validateAndSave(Preamdto vdto);

	default Preamdto findById(int id) {
		return null;
	}

}
