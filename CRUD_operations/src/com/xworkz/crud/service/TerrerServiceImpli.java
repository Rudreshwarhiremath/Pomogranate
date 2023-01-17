package com.xworkz.crud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.crud.dto.TerroristDTO;

public class TerrerServiceImpli implements TerroristeService {

	@Override
	public boolean validateAndSaved(TerroristDTO terroristdto) {
		System.out.println("validation strated....");
		System.out.println("Dto is passed.....");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valide = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violation = valide.validate(terroristdto);
		if (!violation.isEmpty()) {
			System.err.println("error is created");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		}
		System.out.println("No validation errors"+terroristdto);
		return true;
	}

}
